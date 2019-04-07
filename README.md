# CSCI 380-04: Assignment 5 - Due by 11:59 PM, May 1st, 2019
* * * 

     This assignment will go through some basics of unit testing. In order
     to get familiar with junit assertions, study the following link:
     https://junit.org/junit4/javadoc/4.12/org/junit/Assert.html
     
     You should only be updating CategoryItemUtilTest and GetCategoriesTaskTest
     for this assignment. This assignment is very small, and the total number of line changes
     you make shouldn't total more than 10. This is mainly meant to be a reference for the unit testing
     portion in your final project.

# Part 0 - Github Setup - 15%
+ Setup this assignment the same way you did for your previous assignments (see [https://github.com/bhargman/assignment1#part-1---github-setup---5](https://github.com/bhargman/assignment1#part-1---github-setup---5). Name your repo
`assignment5` this time)
+ Add me as a collaborator (username : `bhargman`) to your private repo (see [https://help.github.com/articles/inviting-collaborators-to-a-personal-repository/](https://help.github.com/articles/inviting-collaborators-to-a-personal-repository/)).
    + **If you don't do this step, I'll have no way of grading your assignment**
+ Once you've used `git push`, make sure to check your GitHub repo to confirm that you submitted your assignment properly. Whatever you see on your repo, is what I'll see.  

# Part 1 - Android Studio - 15%
+ Import your `assignment5` repo into Android Studio
    + In the main Android Studio window, tap on "Open an existing Android Studio project"
    + Browse to your `assignment5` folder and select to open it
    + Android Studio will now load the project and you should be able to do the rest of this assignment
        + Note: This may take a few minutes, wait until the processes/indexing spinner in the lower right hand corner is complete
        + Make sure to let Android Studio have access to the internet while it loads the project, so it can fetch dependencies
        + If you get any pop up asking you to update the `Android Gradle Plugin`, please select `Don't remind me again for this project`

# Part 2 - CategoryItemUtilTest - 25%
+ Update the `categoryItem_withOneCategoryIcon_returnsNonEmptyUrlString()` method as described in its comment. This should just be a one-liner.

# Part 3 - GetCategoriesTaskTest - 45%
+ Update the three test methods as described in their comments. The first two methods should just need one assertion each, while the last one requires three assertions.
