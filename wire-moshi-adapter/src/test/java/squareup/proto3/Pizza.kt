// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.proto3.Pizza in pizza.proto
@file:Suppress("DEPRECATION")

package squareup.proto3

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.immutableCopyOf
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import okio.ByteString

public class Pizza(
  toppings: List<String> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<Pizza, Nothing>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.REPEATED,
    schemaIndex = 0,
  )
  public val toppings: List<String> = immutableCopyOf("toppings", toppings)

  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is Pizza) return false
    if (unknownFields != other.unknownFields) return false
    if (toppings != other.toppings) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + toppings.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (toppings.isNotEmpty()) result += """toppings=${sanitize(toppings)}"""
    return result.joinToString(prefix = "Pizza{", separator = ", ", postfix = "}")
  }

  public fun copy(toppings: List<String> = this.toppings, unknownFields: ByteString =
      this.unknownFields): Pizza = Pizza(toppings, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<Pizza> = object : ProtoAdapter<Pizza>(
      FieldEncoding.LENGTH_DELIMITED, 
      Pizza::class, 
      "type.googleapis.com/squareup.proto3.Pizza", 
      PROTO_3, 
      null, 
      "pizza.proto"
    ) {
      override fun encodedSize(`value`: Pizza): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.toppings)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: Pizza) {
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, value.toppings)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: Pizza) {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, value.toppings)
      }

      override fun decode(reader: ProtoReader): Pizza {
        val toppings = mutableListOf<String>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> toppings.add(ProtoAdapter.STRING.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return Pizza(
          toppings = toppings,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: Pizza): Pizza = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
