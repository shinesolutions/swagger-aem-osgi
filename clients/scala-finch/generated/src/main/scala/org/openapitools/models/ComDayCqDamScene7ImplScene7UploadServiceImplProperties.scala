package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param cqPerioddamPeriodscene7PerioduploadservicePeriodactivejobtimeoutPeriodlabel 
 * @param cqPerioddamPeriodscene7PerioduploadservicePeriodconnectionmaxperroutePeriodlabel 
 */
case class ComDayCqDamScene7ImplScene7UploadServiceImplProperties(cqPerioddamPeriodscene7PerioduploadservicePeriodactivejobtimeoutPeriodlabel: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriodscene7PerioduploadservicePeriodconnectionmaxperroutePeriodlabel: Option[ConfigNodePropertyInteger]
                )

object ComDayCqDamScene7ImplScene7UploadServiceImplProperties {
    /**
     * Creates the codec for converting ComDayCqDamScene7ImplScene7UploadServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamScene7ImplScene7UploadServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamScene7ImplScene7UploadServiceImplProperties] = deriveEncoder
}
