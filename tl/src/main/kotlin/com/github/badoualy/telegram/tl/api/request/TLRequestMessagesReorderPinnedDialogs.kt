package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.api.TLAbsInputPeer
import com.github.badoualy.telegram.tl.core.TLBool
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.core.TLObjectVector
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestMessagesReorderPinnedDialogs() : TLMethod<TLBool>() {
    @Transient
    var force: Boolean = false

    var order: TLObjectVector<TLAbsInputPeer> = TLObjectVector()

    private val _constructor: String = "messages.reorderPinnedDialogs#959ff644"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(force: Boolean, order: TLObjectVector<TLAbsInputPeer>) : this() {
        this.force = force
        this.order = order
    }

    protected override fun computeFlags() {
        _flags = 0
        updateFlags(force, 1)
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        computeFlags()

        writeInt(_flags)
        writeTLVector(order)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        _flags = readInt()
        force = isMask(1)
        order = readTLVector<TLAbsInputPeer>()
    }

    override fun computeSerializedSize(): Int {
        computeFlags()

        var size = SIZE_CONSTRUCTOR_ID
        size += SIZE_INT32
        size += order.computeSerializedSize()
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestMessagesReorderPinnedDialogs) return false
        if (other === this) return true

        return _flags == other._flags
                && force == other.force
                && order == other.order
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0x959ff644.toInt()
    }
}