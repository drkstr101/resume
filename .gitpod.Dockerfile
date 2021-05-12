FROM gitpod/workspace-full

# Install custom tools, runtimes, etc.
# For example "bastet", a command-line tetris clone:
# RUN brew install bastet
#
# More information: https://www.gitpod.io/docs/config-docker/
<<<<<<< HEAD
=======

RUN sudo apt-get -q update && \
    sudo apt-get install -yq texlive-full pandoc && \
    sudo rm -rf /var/lib/apt/lists/*
>>>>>>> dc14736 (Fully automate dev setup with Gitpod)
