package xyz.fxcilities.core.particle

import org.bukkit.Particle

class ParticleBuilder(val particle: Particle, val data: Any? = null) {

    fun shouldUseData(): Boolean {
        return data == null || particle.dataType != Void::class.java
    }
}
