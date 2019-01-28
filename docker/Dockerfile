#
# Docker image of the C package manager: clib
# 
# The MIT License (MIT)
# Copyright (c) 2012-2014 clib authors (clibs.org)
#
# https://github.com/clibs/clib
# 


# The MIT License (MIT) 
#
# Copyright (c) 2019 Abraham Hernandez <abraham@abranhe.com>
# https://github.com/abranhe/docker-clib
#
###
 
FROM niccomlt/gradle-javafx

LABEL maintainer="Carlos Abrahama Hernandez <abraham@abranhe.com>"

# RUN \
#     apt-get update &&\
#     apt-get install -y --no-install-recommends openjfx &&\
#     rm -rf /var/lib/apt/lists/*

RUN printf "\n\n\nSHIT WORKING PROPERLY..........\n\n\nI am " && whoami

RUN \
    mkdir -p /home/cop2805-project3

COPY . /home/cop2805-project3

WORKDIR \
    /home/cop2805-project3
 
 RUN \
    javac Main.java

CMD java Main

