package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyDropDown

/**
 * 
 * @param wcmfilterPeriodmode 
 */
case class ComDayCqWcmCoreWCMRequestFilterProperties(wcmfilterPeriodmode: Option[ConfigNodePropertyDropDown]
                )

object ComDayCqWcmCoreWCMRequestFilterProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreWCMRequestFilterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreWCMRequestFilterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreWCMRequestFilterProperties] = deriveEncoder
}
