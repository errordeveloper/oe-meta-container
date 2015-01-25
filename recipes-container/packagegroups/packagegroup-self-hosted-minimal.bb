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

RPM_NATIVE_WRAPPERS = "1"

#XXX: distcc
#EXTRA_OECONF_distcc_append = "--without-gtk"

# glibc-utils: for rpcgen
RDEPENDS_packagegroup-self-hosted-minimal-sdk = "\
    autoconf \
    automake \
    binutils \
    binutils-symlinks \
    cross-localedef \
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
    kconfig-frontends \
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
    net-tools \
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
    dpkg \
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
    mklibs \
    kern-tools \
    minicom \
    mtools \
    ncurses \
    ncurses-tools \
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
    quota \
    readline \
    rpm \
    rpm-build \
    rpm-common \
    rpm-libs \
    rpm-dev \
    setserial \
    shadow \
    socat \
    unifdef \
    util-linux \
    pigz \
    subversion \
    sudo \
    sysstat \
    tar \
    tcl \
    texi2html \
    texinfo \
    texinfo-dummy \
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
    e2fsprogs \
    ldconfig \
    "

#XXX: nativesdk-postinst-intercept

PTH = "pth"
PTH_libc-uclibc = ""

