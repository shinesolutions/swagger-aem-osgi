package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param cqPerioddamPeriodbatchPeriodstatusPeriodmaxassets 
 */
case class ComDayCqDamCoreImplServletAssetStatusServletProperties(cqPerioddamPeriodbatchPeriodstatusPeriodmaxassets: Option[ConfigNodePropertyInteger]
                )

object ComDayCqDamCoreImplServletAssetStatusServletProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletAssetStatusServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletAssetStatusServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletAssetStatusServletProperties] = deriveEncoder
}
