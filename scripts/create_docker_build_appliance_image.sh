#!/bin/bash -x

image_tarball="${1:-/home/vagrant/poky/build}/tmp/deploy/images/qemux86-64/container-build-appliance-qemux86-64.tar.bz2"
docker_build_dir="$(realpath $(dirname $0)/../misc/docker/build_appliance/)" 

cp ${image_tarball} ${docker_build_dir} \
  && sudo docker build -t yocto-build-appliance-x86_64 ${docker_build_dir}
