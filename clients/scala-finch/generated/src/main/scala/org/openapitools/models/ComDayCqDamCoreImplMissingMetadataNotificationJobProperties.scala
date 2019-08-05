package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodistimebased 
 * @param cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodtimebasedPeriodrule 
 * @param cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodperiodPeriodrule 
 * @param cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodrecipient 
 */
case class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties(cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodistimebased: Option[ConfigNodePropertyBoolean],
                cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodtimebasedPeriodrule: Option[ConfigNodePropertyString],
                cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodperiodPeriodrule: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodrecipient: Option[ConfigNodePropertyString]
                )

object ComDayCqDamCoreImplMissingMetadataNotificationJobProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplMissingMetadataNotificationJobProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplMissingMetadataNotificationJobProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplMissingMetadataNotificationJobProperties] = deriveEncoder
}
