
## The main parts of the exercise are:

	*com.company.test.FirstExercise: Implement exercise 1.
    
	*com.company.test.ThirdExercise: Implement exercise 3.

	*com.company.test.ThirdExerciseTest: Unit test for exercise 1.
    
	*com.company.test.ThirdExerciseTest: Unit test for exercise 3.

## Complexity analysis
	*store of FirstExercise has Complexity O(m*n)
	*load of FirstExercise has Complexity O(m)

## How to Build application using different maven-profiles
	*Run ``mvn clean install `` to build the exercise.
	*Run all unit tests ``mvn clean test ``.
	*Run each unit test ``mvn clean test -Dtest=com.company.test.ClassNameTest ``.
