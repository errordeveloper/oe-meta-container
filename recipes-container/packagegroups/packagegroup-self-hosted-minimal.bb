#
# Copyright (C) 2010 Intel Corporation
#

SUMMARY = "Self-hosting"
DESCRIPTION = "Packages required to run the build system"
PR = "r13"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = "\
    packagegroup-self-hosted-minimal \
    packagegroup-self-hosted-minimal-debug \
    packagegroup-self-hosted-minimal-sdk \
    packagegroup-self-hosted-minimal-extended \
    packagegroup-self-hosted-minimal-host-tools \
    "

RDEPENDS_packagegroup-self-hosted-minimal = "\
    packagegroup-self-hosted-minimal-debug \
    packagegroup-self-hosted-minimal-sdk \
    packagegroup-self-hosted-minimal-extended \
    packagegroup-self-hosted-minimal-host-tools \
    "

RDEPENDS_packagegroup-self-hosted-minimal-host-tools = "\
    lsb \
    parted \
    pseudo \
    screen \
    "

#XXX: distcc
#EXTRA_OECONF_distcc_append = "--without-gtk"

# glibc-utils: for rpcgen
RDEPENDS_packagegroup-self-hosted-minimal-sdk = "\
    autoconf \
    automake \
    binutils \
    binutils-symlinks \
    ccache \
    coreutils \
    cpp \
    cpp-symlinks \
    glibc-utils \
    glibc-gconv-ibm850 \
    file \
    findutils \
    g++ \
    g++-symlinks \
    gcc \
    gcc-symlinks \
    intltool \
    ldd \
    less \
    libssp \
    libssp-dev \
    libssp-staticdev \
    libstdc++ \
    libstdc++-dev \
    libtool \
    make \
    mktemp \
    perl-module-re \
    perl-module-text-wrap \
    pkgconfig \
    quilt \
    sed \
    "

RDEPENDS_packagegroup-self-hosted-minimal-debug = " \
    gdb \
    gdbserver \
    rsync \
    strace \
    tcf-agent"


RDEPENDS_packagegroup-self-hosted-minimal-extended = "\
    ${PTH} \
    bzip2 \
    chkconfig \
    chrpath \
    cpio \
    curl \
    diffstat \
    diffutils \
    elfutils \
    expat \
    gamin \
    gawk \
    gdbm \
    gettext \
    gettext-runtime \
    git \
    git-perltools \
    grep \
    groff \
    gzip \
    libaio \
    libsdl \
    libsdl-dev \
    libusb1 \
    libxml2 \
    lrzsz \
    lsof \
    lzo \
    makedevs \
    man \
    man-pages \
    mdadm \
    minicom \
    mtools \
    ncurses \
    ncurses-terminfo-base \
    neon \
    nfs-utils \
    nfs-utils-client \
    openssh-sftp-server \
    openssl \
    opkg \
    opkg-utils \
    patch \
    perl \
    perl-dev \
    perl-modules \
    perl-pod \
    python \
    python-compile \
    python-compiler \
    python-compression \
    python-core \
    python-curses \
    python-datetime \
    python-difflib \
    python-distutils \
    python-elementtree \
    python-email \
    python-fcntl \
    python-git \
    python-json \
    python-logging \
    python-misc \
    python-mmap \
    python-multiprocessing \
    python-netclient \
    python-netserver \
    python-pickle \
    python-pkgutil \
    python-pprint \
    python-re \
    python-rpm \
    python-shell \
    python-sqlite3 \
    python-subprocess \
    python-textutils \
    python-unittest \
    python-unixadmin \
    python-xmlrpc \
    qemu \
    qemu-helper \
    quota \
    readline \
    rpm \
    setserial \
    shadow \
    socat \
    subversion \
    sudo \
    sysstat \
    tar \
    tcl \
    texi2html \
    texinfo \
    unfs3 \
    unzip \
    usbutils \
    watchdog \
    wget \
    which \
    xinetd \
    xz \
    zip \
    zlib \
    "

#XXX: nativesdk-postinst-intercept

PTH = "pth"
PTH_libc-uclibc = ""
