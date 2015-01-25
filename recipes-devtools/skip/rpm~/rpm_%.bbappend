do_install_append() {
    if [ "x$RPM_NATIVE_WRAPPERS" != "x" ]; then
        add_native_wrapper
    fi
}
