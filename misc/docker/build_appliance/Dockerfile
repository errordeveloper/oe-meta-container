FROM scratch
ADD ./container-build-appliance-qemux86-64.tar.bz2 ./
RUN useradd -u 1000 -U builder
WORKDIR /poky
USER builder
ENTRYPOINT [ "/bin/bash" ]
CMD [ "-l" ]
