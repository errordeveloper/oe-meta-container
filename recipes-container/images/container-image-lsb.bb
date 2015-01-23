DESCRIPTION = "An image containing packages that are required to conform \
to the Linux Standard Base (LSB) specification."

IMAGE_FEATURES += "package-management"

IMAGE_INSTALL = "\
    packagegroup-core-cmdline \
    packagegroup-core-lsb \
    "

inherit core-image distro_features_check

#REQUIRED_DISTRO_FEATURES = "pam"
