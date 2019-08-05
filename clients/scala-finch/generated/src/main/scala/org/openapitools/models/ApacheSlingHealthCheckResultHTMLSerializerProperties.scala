package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param styleString 
 */
case class ApacheSlingHealthCheckResultHTMLSerializerProperties(styleString: Option[ConfigNodePropertyString]
                )

object ApacheSlingHealthCheckResultHTMLSerializerProperties {
    /**
     * Creates the codec for converting ApacheSlingHealthCheckResultHTMLSerializerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ApacheSlingHealthCheckResultHTMLSerializerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ApacheSlingHealthCheckResultHTMLSerializerProperties] = deriveEncoder
}
