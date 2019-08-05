package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param slingPeriodauthPeriodrequirements 
 */
case class ComDayCqWcmFoundationImplPageImpressionsTrackerProperties(slingPeriodauthPeriodrequirements: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmFoundationImplPageImpressionsTrackerProperties {
    /**
     * Creates the codec for converting ComDayCqWcmFoundationImplPageImpressionsTrackerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmFoundationImplPageImpressionsTrackerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmFoundationImplPageImpressionsTrackerProperties] = deriveEncoder
}
