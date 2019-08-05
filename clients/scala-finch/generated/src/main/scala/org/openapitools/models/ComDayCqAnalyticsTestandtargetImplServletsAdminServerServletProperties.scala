package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param testandtargetPeriodendpointPeriodurl 
 */
case class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties(testandtargetPeriodendpointPeriodurl: Option[ConfigNodePropertyString]
                )

object ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties {
    /**
     * Creates the codec for converting ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties] = deriveEncoder
}
