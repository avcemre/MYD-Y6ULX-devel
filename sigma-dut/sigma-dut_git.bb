SUMMARY = "Tools for WFA Sigma DUT/CA"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://README;md5=cb7b88c5098324bb9a20d2a79d76327e"
SECTION = "base"


SRC_URI = "file://home/vhspc/MYD-Y6ULX-devel/04_Sources/sigma-dut;protocol=file;branch=github-qca/master; \
"


SRCREV = "fd7359aed6aaba745e31dd0a9fed80578372d554"

S = "${WORKDIR}/home/vhspc/MYD-Y6ULX-devel/04_Sources/sigma-dut"

do_install() {
        install -d ${D}${sbindir}
        install -m 0755 ${S}/sigma_dut ${D}${sbindir}/
}
