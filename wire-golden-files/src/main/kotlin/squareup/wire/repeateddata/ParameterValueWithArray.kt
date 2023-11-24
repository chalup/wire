// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.wire.repeateddata.ParameterValueWithArray in squareup/wire/repeated_data.proto
@file:Suppress("DEPRECATION")

package squareup.wire.repeateddata

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.FloatArrayList
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.decodePrimitive_float
import com.squareup.wire.`internal`.encodeArray_float
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.FloatArray
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.Suppress
import okio.ByteString

public class ParameterValueWithArray(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#FLOAT_ARRAY",
    label = WireField.Label.PACKED,
    declaredName = "data",
    schemaIndex = 0,
  )
  public val data_: FloatArray = floatArrayOf(),
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<ParameterValueWithArray, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is ParameterValueWithArray) return false
    if (unknownFields != other.unknownFields) return false
    if (!data_.contentEquals(other.data_)) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + data_.contentHashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (data_.isNotEmpty()) result += """data_=${data_.contentToString()}"""
    return result.joinToString(prefix = "ParameterValueWithArray{", separator = ", ", postfix = "}")
  }

  public fun copy(data_: FloatArray = this.data_, unknownFields: ByteString = this.unknownFields):
      ParameterValueWithArray = ParameterValueWithArray(data_, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<ParameterValueWithArray> = object :
        ProtoAdapter<ParameterValueWithArray>(
      FieldEncoding.LENGTH_DELIMITED, 
      ParameterValueWithArray::class, 
      "type.googleapis.com/squareup.wire.repeateddata.ParameterValueWithArray", 
      PROTO_2, 
      null, 
      "squareup/wire/repeated_data.proto"
    ) {
      override fun encodedSize(`value`: ParameterValueWithArray): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.FLOAT_ARRAY.encodedSizeWithTag(1, value.data_)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: ParameterValueWithArray) {
        ProtoAdapter.FLOAT_ARRAY.encodeWithTag(writer, 1, value.data_)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: ParameterValueWithArray) {
        writer.writeBytes(value.unknownFields)
        encodeArray_float(value.data_, writer, 1)
      }

      override fun decode(reader: ProtoReader): ParameterValueWithArray {
        var data_: FloatArrayList? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> {
              if (data_ == null) {
                data_ = FloatArrayList.forDecoding(reader.nextFieldMinLengthInBytes(), 4)
              }
              data_!!.add(decodePrimitive_float(reader))
            }
            else -> reader.readUnknownField(tag)
          }
        }
        return ParameterValueWithArray(
          data_ = data_?.toArray() ?: floatArrayOf(),
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: ParameterValueWithArray): ParameterValueWithArray = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
