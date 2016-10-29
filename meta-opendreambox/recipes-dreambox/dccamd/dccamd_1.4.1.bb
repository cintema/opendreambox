SUMMARY = "Dreamcrypt/Firecrypt Conditional Access Daemon"
DEPENDS = "openssl systemd"

SRC_URI[armv7ahf-neon.md5sum] = "f3417ad050c4ae168cadc6b52f0511b7"
SRC_URI[armv7ahf-neon.sha256sum] = "c0e8646d7a6f3dcbfbd12863f1c583838e2246e5b44f6a93a156056386f7df3a"
SRC_URI[mips32el.md5sum] = "2c59dede28f7b669a48a5cb772e412d8"
SRC_URI[mips32el.sha256sum] = "042e7caf0baf75fc9555da6d0a1e7d79193bc35e4c0839eba4623bb825905551"

SYSTEMD_SERVICE_${PN} = "dccamd.service"

inherit opendreambox-precompiled-binary systemd
