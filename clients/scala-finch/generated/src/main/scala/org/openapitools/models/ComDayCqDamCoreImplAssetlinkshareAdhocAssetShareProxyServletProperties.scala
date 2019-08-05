package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param cqPerioddamPeriodadhocPeriodassetPeriodsharePeriodprezipPeriodmaxcontentsize 
 */
case class ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties(cqPerioddamPeriodadhocPeriodassetPeriodsharePeriodprezipPeriodmaxcontentsize: Option[ConfigNodePropertyInteger]
                )

object ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties] = deriveEncoder
}
