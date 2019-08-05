package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param cqPerioddamPeriodscene7PeriodassetmimetypeservicePeriodmapping 
 */
case class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties(cqPerioddamPeriodscene7PeriodassetmimetypeservicePeriodmapping: Option[ConfigNodePropertyArray]
                )

object ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties {
    /**
     * Creates the codec for converting ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties] = deriveEncoder
}
