#!/bin/bash

echo "🧹 Cleaning all generated .jar files..."

# Go to the project root
cd "$(dirname "$0")/.." || exit 1

# Find and delete .jar files
find . -type f \( -name "main-example.jar" -o -name "main-solution.jar" \) -exec rm -v {} \;

echo "✅ All jars cleaned."
