package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param cqPerioddamPeriodbatchPeriodindesignPeriodmaxassets 
 */
case class ComDayCqDamCoreImplServletAssetXMPSearchServletProperties(cqPerioddamPeriodbatchPeriodindesignPeriodmaxassets: Option[ConfigNodePropertyInteger]
                )

object ComDayCqDamCoreImplServletAssetXMPSearchServletProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletAssetXMPSearchServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletAssetXMPSearchServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletAssetXMPSearchServletProperties] = deriveEncoder
}
