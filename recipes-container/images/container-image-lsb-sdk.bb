require container-image-lsb.bb

DESCRIPTION = "Basic image without X support suitable for Linux Standard Base \
(LSB) implementations. It includes the full meta-toolchain, plus development \
headers and libraries to form a standalone SDK."

IMAGE_FEATURES += "tools-sdk dev-pkgs"
