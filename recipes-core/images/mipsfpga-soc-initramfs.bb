
include recipes-core/images/core-image-minimal.bb
 
IMAGE_FSTYPES = "${INITRAMFS_FSTYPES}"
PACKAGE_INSTALL = "${IMAGE_INSTALL}"

# Use persistent, pre-populated /dev
USE_DEVFS = "0"
