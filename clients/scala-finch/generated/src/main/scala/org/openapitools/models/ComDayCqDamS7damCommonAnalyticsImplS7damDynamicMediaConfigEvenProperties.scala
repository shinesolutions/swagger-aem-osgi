package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param cqPerioddamPeriods7damPerioddynamicmediaconfigeventlistenerPeriodenabled 
 */
case class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties(cqPerioddamPeriods7damPerioddynamicmediaconfigeventlistenerPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties {
    /**
     * Creates the codec for converting ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties] = deriveEncoder
}
