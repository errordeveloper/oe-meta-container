#
# Copyright (C) 2010 Intel Corporation
#

SUMMARY = "Standard full-featured Linux system"
DESCRIPTION = "Package group bringing in packages needed for a more traditional full-featured Linux system"
PR = "r6"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = "\
    packagegroup-core-cmdline \
    packagegroup-core-cmdline-libs \
    packagegroup-core-cmdline-utils \
    packagegroup-core-cmdline-extended \
    packagegroup-core-cmdline-dev-utils \
    packagegroup-core-cmdline-multiuser \
    packagegroup-core-cmdline-sys-services \
    "

python __anonymous () {
    # For backwards compatibility after rename
    namemap = {}
    namemap["packagegroup-core-cmdline"] = "packagegroup-core-basic"
    namemap["packagegroup-core-cmdline-libs"] = "packagegroup-core-basic-libs"
    namemap["packagegroup-core-cmdline-utils"] = "packagegroup-core-basic-utils"
    namemap["packagegroup-core-cmdline-extended"] = "packagegroup-core-basic-extended"
    namemap["packagegroup-core-cmdline-dev-utils"] = "packagegroup-core-dev-utils"
    namemap["packagegroup-core-cmdline-multiuser"] = "packagegroup-core-multiuser"
    namemap["packagegroup-core-cmdline-sys-services"] = "packagegroup-core-sys-services"

    packages = d.getVar("PACKAGES", True).split()
    for pkg in packages:
        if pkg.endswith('-dev'):
            mapped = namemap.get(pkg[:-4], None)
            if mapped:
                mapped += '-dev'
        elif pkg.endswith('-dbg'):
            mapped = namemap.get(pkg[:-4], None)
            if mapped:
                mapped += '-dbg'
        else:
            mapped = namemap.get(pkg, None)

        if mapped:
            oldtaskname = mapped.replace("packagegroup-core", "task-core")
            mapstr = " %s %s" % (mapped, oldtaskname)
            d.appendVar("RPROVIDES_%s" % pkg, mapstr)
            d.appendVar("RREPLACES_%s" % pkg, mapstr)
            d.appendVar("RCONFLICTS_%s" % pkg, mapstr)
}


RDEPENDS_packagegroup-core-cmdline = "\
    packagegroup-core-cmdline-libs \
    packagegroup-core-cmdline-utils \
    packagegroup-core-cmdline-extended \
    packagegroup-core-cmdline-dev-utils \
    packagegroup-core-cmdline-multiuser \
    packagegroup-core-cmdline-sys-services \
    "

RDEPENDS_packagegroup-core-cmdline-libs = "\
    glib-2.0 \
    "

RDEPENDS_packagegroup-core-cmdline-utils = "\
    bash \
    acl \
    attr \
    bc \
    coreutils \
    cpio \
    e2fsprogs \
    ed \
    file \
    findutils \
    gawk \
    gmp \
    grep \
    makedevs \
    mktemp \
    ncurses \
    net-tools \
    pax \
    popt \
    procps \
    psmisc \
    sed \
    tar \
    time \
    util-linux \
    zlib \
    "

RDEPENDS_packagegroup-core-cmdline-extended = "\
    openssl \
    "

RDEPENDS_packagegroup-core-cmdline-dev-utils = "\
    byacc \
    diffutils \
    m4 \
    make \
    patch \
    "

RDEPENDS_packagegroup-core-cmdline-multiuser = "\
    shadow \
    sudo \
    "

RDEPENDS_packagegroup-core-cmdline-sys-services = "\
    at \
    bzip2 \
    cronie \
    dbus \
    dbus-glib \
    python-dbus \
    elfutils \
    pigz \
    less \
    libcap \
    libevent \
    lighttpd \
    nfs-utils \
    libpcre \
    rpcbind \
    sysfsutils \
    tcp-wrappers \
    tzdata \
    "

