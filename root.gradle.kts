plugins {
    id("io.github.null2264.preprocess")
}

preprocess {
    val neoforge12005 = createNode("1.20.5-neoforge", 12005, "mojang")
    val neoforge12002 = createNode("1.20.2-neoforge", 12002, "mojang")

    val forge12002 = createNode("1.20.2-forge", 12002, "mojang")

    val fabric12005 = createNode("1.20.5-fabric", 12005, "mojang")
    val fabric12002 = createNode("1.20.2-fabric", 12002, "mojang")

    // In case CHASM released
    //val quilt12002 = createNode("1.20.2-quilt", 12002, "mojang")

    neoforge12005.link(fabric12005)
    neoforge12002.link(forge12002)

    forge12002.link(fabric12002)

    // quilt12002.link(fabric12002)

    fabric12005.link(fabric12002)
    fabric12002.link(fabric11800)
}
