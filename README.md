# CSAApp

This is the official repository for the CSA Android App maintained by **DevSoc BITS Goa**. This app consists of multiple features including food-ordering, PR drives, events and notice management, exam schedules and timetables.<br/>

## Table of Contents
- [Setting up your development environment](#Setting-up-your-development-environment)
- [Commit Messages](#Commit-Messages)
- [Pull Request Guidelines](#Pull-Request-Guidelines)
- [Code Style](#code-style)
- [Code Contribution Workflow](#Code-Contribution-Workflow)
- [Reach Out](#reach-out)
- [Admins](#admins)

## Setting up your development environment

1. Download and install [Git](https://git-scm.com/downloads) and add it to your PATH
1. Download and install [Android Studio](https://developer.android.com/studio/index.html) 
1. Fork the CSAApp project ([why and how to fork](https://help.github.com/articles/fork-a-repo/))
1. Clone your fork of the project locally. At the command line:

        git clone https://github.com/YOUR-GITHUB-USERNAME/CSAApp

    If you prefer not to use the command line, you can use Android Studio to create a new project from version control using `https://github.com/YOUR-GITHUB-USERNAME/CSAApp`.
    
1. Use Android Studio to import the project from its Gradle settings. To run the project, click on the green arrow at the top of the screen.
1. Add an `upstream` remote to your Android Studio from which you will pull your project before pushing any code.

## Commit Messages

1. Commit messages are communication and documentation. They're a log of more than just *what* happened, they're about *why* it was done.
1. The longer a project is active, the more people involved, the larger the codebase, the more important it is to have good commit messages.
1. Make sure every change that you make is well documented and is included in your commit message.
1. **One** commit should have only **one** change. (A change may include multiple file changes that are essential to solving the issue/change).
1. All commit messages should be in the imperative-present tense. After all, you are telling us what you have *already* done.

## Pull Request Guidelines

1. The subject line should be a one-sentence summary, and should not include
   the word *and* (explicitly or implied).
1. Any extra detail should be provided in the body of the PR.
1. Don't submit unrelated changes in the same pull request.
1. Make sure you follow the [code style](#code-style)

## Code Style

All variables should have proper names. There should be no `textview1` or `edittext2` view names **AT ALL**.

### JAVA
1. All class or interface names should be camel-cased and should start with an upper-case letter.
1. All field names, variable names, and method names should be camel-cased and should start with a lower-case letter.
1. All constant names of the type : 
  `private static final int REQUEST_CODE = 777;`
  should be in ALL-CAPS with snake-casing.
1. Every loop, if/else block or method branching should have a proper 4-spaced-tab indentation.

### XML

1. All strings, colors, and dimensions should be placed in `strings.xml`, `colors.xml` and `dimens.xml` respectively and should be referenced from there only.
1. All IDs should be **completely** lower-cased and snake-casing should be used.
1. Every nested Layout/View should have a proper 4-spaced-tab indentation.

## Code Contribution Workflow

1. Clone **your** repository.
1. Make your changes.
1. Push changes to **your** repository.
1. Make a pull-request **to the respective branch only**.
1. The pull-request will be checked by the core/admins.
1. If there are issues found in the PR, you will be asked to make changes again, and push them. YOU DO NOT NEED TO MAKE A NEW PULL REQUEST. Just push changes to your repository and the newest commits will be reflected in your pull-request automatically.
1. If your code is satisfactory, it will be added to the main repository.

## Reach Out

This is a very complex project and you are bound to make mistakes. Ping any of us admins if you need any help. <br/>

Happy Coding! <3

## Admins
- [Arjun Bajpai](https://github.com/antailbaxt3r/)
- [Prubhutva Agrawal](https://github.com/Prabhutva)
- [Yatik Budhrani](https://github.com/yatikbudhrani)
- [Garima Sharma](https://github.com/Garima-189)
- [Anshuman Singh](https://github.com/MysteriousAcadia)
- [Kartik Bhardwaj](https://github.com/kartikbhardwaj2000)
