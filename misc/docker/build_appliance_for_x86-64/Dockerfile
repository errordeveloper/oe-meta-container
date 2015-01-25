FROM yocto-build-appliance-x86_64

## To run this image, you should have at least two volumes:
##
##     /poky <= [https://github.com/errordeveloper/oe-meta-container]
##     /poky/meta-container <= [https://github.com/errordeveloper/oe-meta-container]
##
## The builds will be cached data inside the `/poky` volume, local to the build host.
## The resulting volume can be transfer to Docker hub or elsewhere, but this up to you.
## Addtionally, one you provide a downloads volume as well...

ENV TEMPLATECONF meta-container/conf
ENV MACHINE qemux86-64
ENV DL_DIR /poky/downloads
#CMD [ "-c", "source oe-init-build-env; ../meta-container/scripts/post-init-build-env tmp/sysroots/x86_64-linux/; $SHELL -l;" ]
ENTRYPOINT [ "/bin/bash", "-x", "-c", "env; run_args=\"$@\"; shift $#; source oe-init-build-env; ../meta-container/scripts/post-init-build-env tmp/sysroots/x86_64-linux/; exec bitbake ${run_args};", "--" ]

CMD [ "busybox" ]
