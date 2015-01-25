LICENSE = "MIT"

PACKAGE_INSTALL = "\
    base-passwd \
    "

IMAGE_FEATURES += "\
    dev-pkgs \
    tools-sdk \
    package-management \
    "

IMAGE_LINGUAS = ""

inherit core-image
