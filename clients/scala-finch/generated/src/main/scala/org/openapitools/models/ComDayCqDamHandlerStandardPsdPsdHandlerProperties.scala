package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param largeUnderscorefileUnderscorethreshold 
 */
case class ComDayCqDamHandlerStandardPsdPsdHandlerProperties(largeUnderscorefileUnderscorethreshold: Option[ConfigNodePropertyInteger]
                )

object ComDayCqDamHandlerStandardPsdPsdHandlerProperties {
    /**
     * Creates the codec for converting ComDayCqDamHandlerStandardPsdPsdHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamHandlerStandardPsdPsdHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamHandlerStandardPsdPsdHandlerProperties] = deriveEncoder
}
