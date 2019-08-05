package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param cqPerioddamPeriodallowPeriodallPeriodmime 
 * @param cqPerioddamPeriodallowedPeriodassetPeriodmimes 
 */
case class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties(cqPerioddamPeriodallowPeriodallPeriodmime: Option[ConfigNodePropertyBoolean],
                cqPerioddamPeriodallowedPeriodassetPeriodmimes: Option[ConfigNodePropertyArray]
                )

object ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties] = deriveEncoder
}
