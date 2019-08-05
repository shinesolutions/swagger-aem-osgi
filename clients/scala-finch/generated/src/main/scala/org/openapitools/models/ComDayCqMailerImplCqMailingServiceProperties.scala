package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param maxPeriodrecipientPeriodcount 
 */
case class ComDayCqMailerImplCqMailingServiceProperties(maxPeriodrecipientPeriodcount: Option[ConfigNodePropertyString]
                )

object ComDayCqMailerImplCqMailingServiceProperties {
    /**
     * Creates the codec for converting ComDayCqMailerImplCqMailingServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMailerImplCqMailingServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMailerImplCqMailingServiceProperties] = deriveEncoder
}
