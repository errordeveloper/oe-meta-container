FROM scratch
ADD ./container-build-appliance-qemux86-64.tar.bz2 ./
RUN useradd -u 1000 -U builder
WORKDIR /poky
USER builder
#env PSEUDO_PREFIX /usr
#env PSEUDO_LOCALSTATEDIR /home/vagrant/pseudo
#env PSEUDO_LIBDIR /usr/lib/pseudo/lib64
ENTRYPOINT [ "/bin/bash" ]
CMD [ "-l" ]
