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

