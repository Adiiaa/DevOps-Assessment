git branch

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (main)
$ git remote add origin https://github.com/Adiiaa/DevOps-Assessment.git

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (main)
$ git remote -v
origin  https://github.com/Adiiaa/DevOps-Assessment.git (fetch)
origin  https://github.com/Adiiaa/DevOps-Assessment.git (push)

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (main)
$ git add .
warning: in the working copy of '.gitignore', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'pom.xml', LF will be replaced by CRLF the next time Git touches it

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (main)
$ git add --all

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (main)
$ git commit -m "Project SetUp"
[main (root-commit) a5b35bf] Project SetUp
4 files changed, 72 insertions(+)
create mode 100644 .gitignore
create mode 100644 .idea/.gitignore
create mode 100644 .idea/misc.xml
create mode 100644 pom.xml

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (main)
$ git push -u origin main
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (7/7), done.
Writing objects: 100% (7/7), 1.24 KiB | 318.00 KiB/s, done.
Total 7 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Adiiaa/DevOps-Assessment.git
* [new branch]      main -> main
  branch 'main' set up to track 'origin/main'.

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (main)
$ git checkout -b dev
Switched to a new branch 'dev'

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (dev)
$ git push -u origin dev
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote:
remote: Create a pull request for 'dev' on GitHub by visiting:
remote:      https://github.com/Adiiaa/DevOps-Assessment/pull/new/dev
remote:
To https://github.com/Adiiaa/DevOps-Assessment.git
* [new branch]      dev -> dev
  branch 'dev' set up to track 'origin/dev'.

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (dev)
$ git checkout -b test
Switched to a new branch 'test'

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (test)
$ git branch
dev
main
* test

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (test)
$ git push -u origin test
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote:
remote: Create a pull request for 'test' on GitHub by visiting:
remote:      https://github.com/Adiiaa/DevOps-Assessment/pull/new/test
remote:
To https://github.com/Adiiaa/DevOps-Assessment.git
* [new branch]      test -> test
  branch 'test' set up to track 'origin/test'.

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (test)
$ git branch -r
origin/dev
origin/main
origin/test

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (test)
$ git checkout dev
Switched to branch 'dev'
Your branch is up to date with 'origin/dev'.

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (dev)
$ git branch -d test
Deleted branch test (was a5b35bf).

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (dev)
$ git push origin --delete test
To https://github.com/Adiiaa/DevOps-Assessment.git
- [deleted]         test

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (dev)
$ git checkout -b ft/setup
Switched to a new branch 'ft/setup'

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (ft/setup)
$ git push -u origin ft/setup
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote:
remote: Create a pull request for 'ft/setup' on GitHub by visiting:
remote:      https://github.com/Adiiaa/DevOps-Assessment/pull/new/ft/setup
remote:
To https://github.com/Adiiaa/DevOps-Assessment.git
* [new branch]      ft/setup -> ft/setup
  branch 'ft/setup' set up to track 'origin/ft/setup'.

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (ft/setup)
$ git add .
Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (ft/setup)
$ git commit -m "feat: add test.java with placeholder greeting logic"
[ft/setup b65da97] feat: add test.java with placeholder greeting logic
2 files changed, 125 insertions(+)
create mode 100644 README.md
create mode 100644 src/test/java/test.java
Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (ft/setup)
$ git stash
Saved working directory and index state WIP on ft/setup: b65da97 feat: add test.java with placeholder greeting logic

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (ft/setup)
$ git stash list
stash@{0}: WIP on ft/setup: b65da97 feat: add test.java with placeholder greeting logic

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (ft/setup)
$ git stash apply stash@{0}
On branch ft/setup
Your branch is ahead of 'origin/ft/setup' by 1 commit.
(use "git push" to publish your local commits)

Changes not staged for commit:
(use "git add <file>..." to update what will be committed)
(use "git restore <file>..." to discard changes in working directory)
modified:   README.md
modified:   src/test/java/test.java

no changes added to commit (use "git add" and/or "git commit -a")

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (ft/setup)
$ git status
On branch ft/setup
Your branch is ahead of 'origin/ft/setup' by 1 commit.
(use "git push" to publish your local commits)

Changes not staged for commit:
(use "git add <file>..." to update what will be committed)
(use "git restore <file>..." to discard changes in working directory)
modified:   README.md
modified:   src/test/java/test.java

no changes added to commit (use "git add" and/or "git commit -a")

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (ft/setup)
$ git add .

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (ft/setup)
$ git commit -m "docs: Restoring stash changes - updated README and test.java files"
[ft/setup 6ee1786] docs: Restoring stash changes - updated README and test.java files
2 files changed, 7 insertions(+), 2 deletions(-)

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (ft/setup)
$ git push origin ft/setup
Enumerating objects: 15, done.
Counting objects: 100% (15/15), done.
Delta compression using up to 8 threads
Compressing objects: 100% (8/8), done.
Writing objects: 100% (14/14), 2.08 KiB | 151.00 KiB/s, done.
Total 14 (delta 3), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (3/3), done.
To https://github.com/Adiiaa/DevOps-Assessment.git
a5b35bf..6ee1786  ft/setup -> ft/setup
Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (ft/setup)
$ git stash drop stash@{0}
Dropped stash@{0} (b3ffe91f32b36c23e1311fd5c71c467267f6c3db)
Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (ft/setup)
$ git checkout main
Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (main)
$ git add .

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (main)
$ git commit -m "docs: changing the person to greet in test.java file"
[main 23e43d8] docs: changing the person to greet in test.java file
1 file changed, 9 insertions(+)
create mode 100644 src/test/java/test.java

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (main)
$ git push
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (6/6), 585 bytes | 48.00 KiB/s, done.
Total 6 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/Adiiaa/DevOps-Assessment.git
a5b35bf..23e43d8  main -> main

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (main)
$ git checkout ft/setup
Switched to branch 'ft/setup'
Your branch is up to date with 'origin/ft/setup'.

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (ft/setup)
$ git merge main
Auto-merging src/test/java/test.java
CONFLICT (add/add): Merge conflict in src/test/java/test.java
Automatic merge failed; fix conflicts and then commit the result.

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (ft/setup|MERGING)
$ git add .

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (ft/setup|MERGING)
$ git commit -m "merge: Resolving confilcts between main and ft/setup"
[ft/setup 3d10a8d] merge: Resolving confilcts between main and ft/setup

Adia Uwase@DESKTOP-QOVNG9F MINGW64 ~/OneDrive/Desktop/QA testing training/DevOps-Assessment (ft/setup)
$ git push
Enumerating objects: 16, done.
Counting objects: 100% (16/16), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (6/6), 480 bytes | 160.00 KiB/s, done.
Total 6 (delta 2), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (2/2), completed with 2 local objects.
To https://github.com/Adiiaa/DevOps-Assessment.git
25becdc..3d10a8d  ft/setup -> ft/setup

