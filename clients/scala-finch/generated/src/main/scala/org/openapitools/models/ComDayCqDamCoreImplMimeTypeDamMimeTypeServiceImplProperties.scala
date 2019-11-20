package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param cqPerioddamPerioddetectPeriodassetPeriodmimePeriodfromPeriodcontent 
 */
case class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties(cqPerioddamPerioddetectPeriodassetPeriodmimePeriodfromPeriodcontent: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties] = deriveEncoder
}