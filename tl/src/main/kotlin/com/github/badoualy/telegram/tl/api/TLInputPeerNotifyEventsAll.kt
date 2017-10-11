package com.github.badoualy.telegram.tl.api

/**
 * inputPeerNotifyEventsAll#e86a2c74
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLInputPeerNotifyEventsAll : TLAbsInputPeerNotifyEvents() {
    private val _constructor: String = "inputPeerNotifyEventsAll#e86a2c74"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLInputPeerNotifyEventsAll) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xe86a2c74.toInt()
    }
}