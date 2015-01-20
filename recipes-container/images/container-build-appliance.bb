LICENSE = "MIT"

PACKAGE_INSTALL = "\
    packagegroup-self-hosted-minimal \
    base-passwd \
    "

IMAGE_FEATURES += "package-management"

IMAGE_LINGUAS = ""

inherit core-image
