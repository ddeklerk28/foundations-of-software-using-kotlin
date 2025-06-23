#!/bin/bash

# Go to the root of the project
cd "$(dirname "$0")/.." || exit 1

echo "🔍 Searching for exercise folders..."

# Find all exercise folders that contain Main.kt or Main-solution.kt
find . -type f \( -name "Main.kt" -o -name "Main-solution.kt" \) | while read -r file; do
    dir=$(dirname "$file")

    # Create run-example.sh
    cat > "$dir/run-example.sh" <<EOF
#!/bin/bash
make -f ../../../../Makefile run path=\$(pwd)
EOF

    # Create run-solution.sh
    cat > "$dir/run-solution.sh" <<EOF
#!/bin/bash
make -f ../../../../Makefile run-solution path=\$(pwd)
EOF

    # Make scripts executable
    chmod +x "$dir/run-example.sh" "$dir/run-solution.sh"

    echo "✅ Generated scripts in $dir"
done

echo "🏁 Done generating run scripts."
