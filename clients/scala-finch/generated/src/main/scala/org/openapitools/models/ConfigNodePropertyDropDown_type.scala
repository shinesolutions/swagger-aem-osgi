package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param labels Drop Down label
 * @param values Drown Down value
 */
case class ConfigNodePropertyDropDown_type(labels: Option[Object],
                values: Option[Object]
                )

object ConfigNodePropertyDropDown_type {
    /**
     * Creates the codec for converting ConfigNodePropertyDropDown_type from and to JSON.
     */
    implicit val decoder: Decoder[ConfigNodePropertyDropDown_type] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConfigNodePropertyDropDown_type] = deriveEncoder
}
