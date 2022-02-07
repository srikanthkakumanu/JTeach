# Git

## Git: Configure Git

```
git config --list --show-origin
git config --global user.email "you@example.com"
git config --global user.name "Your Name"
git config --global init.defaultBranch main
git config --list
```
## Git: Generate SSH Keypair

```
ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
eval "$(ssh-agent -s)"
ssh-add ~/.ssh/id_rsa
cat ~/.ssh/id_rsa.pub
```
## Git: Clone Git Repository

You need to clone the repository:
- to make changes in code
- add the changes to local repository
- commit the changes which are added
- Finally push the committed changes to remote (central) repository
 
```
git clone git@github.com:srikanthkakumanu/JTeach.git
git add README.md
git commit -m "first commit"
git push -u origin main
```

## Add generated SSH Key to Repository

Git Server or Repository Admin will add your RSA public key to Git Repository.

## Create a new repository on the command line
```
echo "# JTeach" >> README.md
git init
git add .gitignore
git add README.md
git add *.java (or simply git add .)
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:srikanthkakumanu/JTeach.git
git push -u origin main
```

## Push an existing repository from the command line

```
git remote add origin git@github.com:srikanthkakumanu/JTeach.git
git branch -M main
git push -u origin main
```

