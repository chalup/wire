// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.custom_options.my_field_option_one in custom_options.proto
@file:Suppress("DEPRECATION")

package com.squareup.wire.protos.custom_options

import kotlin.Int
import kotlin.Suppress
import kotlin.`annotation`.AnnotationRetention
import kotlin.`annotation`.AnnotationTarget
import kotlin.`annotation`.Retention
import kotlin.`annotation`.Target

/**
 * This is a superb option! Apply it to your greatest fields.
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(
  AnnotationTarget.PROPERTY,
  AnnotationTarget.FIELD,
)
public annotation class MyFieldOptionOneOption(
  public val `value`: Int,
)
