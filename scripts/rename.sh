#!/bin/bash

cd "$(dirname "$0")/.." || exit 1

echo "🔍 Searching for files named 'Main-complete.kt'..."

find . -type f -name "Main-complete.kt" | while read -r file; do
  new_name="$(dirname "$file")/Main-solution.kt"

  if [ -f "$new_name" ]; then
    echo "⚠️  Skipping '$file' – 'Main-solution.kt' already exists in this folder."
  else
    mv "$file" "$new_name"
    echo "✅ Renamed '$file' → '$new_name'"
  fi
done

echo "🏁 Done."
