package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyDropDown_type

/**
 * 
 * @param name property name
 * @param optional True if optional
 * @param isUnderscoreset True if property is set
 * @param _type 
 * @param value Property value
 * @param description Property description
 */
case class ConfigNodePropertyDropDown(name: Option[String],
                optional: Option[Boolean],
                isUnderscoreset: Option[Boolean],
                _type: Option[ConfigNodePropertyDropDown_type],
                value: Option[Object],
                description: Option[String]
                )

object ConfigNodePropertyDropDown {
    /**
     * Creates the codec for converting ConfigNodePropertyDropDown from and to JSON.
     */
    implicit val decoder: Decoder[ConfigNodePropertyDropDown] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConfigNodePropertyDropDown] = deriveEncoder
}
