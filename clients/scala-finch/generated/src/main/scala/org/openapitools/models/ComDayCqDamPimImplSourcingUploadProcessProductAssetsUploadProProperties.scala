package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param deletePeriodzipPeriodfile 
 */
case class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties(deletePeriodzipPeriodfile: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties {
    /**
     * Creates the codec for converting ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties] = deriveEncoder
}
