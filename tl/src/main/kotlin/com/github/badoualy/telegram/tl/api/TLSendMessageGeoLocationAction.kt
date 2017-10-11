package com.github.badoualy.telegram.tl.api

/**
 * sendMessageGeoLocationAction#176f8ba1
 *
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLSendMessageGeoLocationAction : TLAbsSendMessageAction() {
    private val _constructor: String = "sendMessageGeoLocationAction#176f8ba1"

    override val constructorId: Int = CONSTRUCTOR_ID

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLSendMessageGeoLocationAction) return false
        if (other === this) return true

        return true
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x176f8ba1.toInt()
    }
}