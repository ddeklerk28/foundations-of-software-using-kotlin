KOTLINC=kotlinc
JAVA=java

.PHONY: run run-solution clean

# Usage:
# make run path=path/to/exercise
# make run-solution path=path/to/exercise
# make clean path=path/to/exercise

run:
	@cd $(path) && $(KOTLINC) Main.kt -include-runtime -d main-example.jar && $(JAVA) -jar main-example.jar

run-solution:
	@cd $(path) && $(KOTLINC) Main-solution.kt -include-runtime -d main-solution.jar && $(JAVA) -jar main-solution.jar

clean:
	@cd $(path) && rm -f main-example.jar main-solution.jar
