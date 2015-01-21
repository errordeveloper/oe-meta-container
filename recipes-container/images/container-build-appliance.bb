LICENSE = "MIT"

PACKAGE_INSTALL = "\
    base-passwd \
    packagegroup-self-hosted-minimal \
    "

IMAGE_FEATURES += "\
    dev-pkgs \
    package-management \
    "

IMAGE_LINGUAS = ""

inherit core-image
