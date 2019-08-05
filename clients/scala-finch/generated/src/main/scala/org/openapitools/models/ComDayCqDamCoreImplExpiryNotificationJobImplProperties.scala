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
 * @param cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodistimebased 
 * @param cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodtimebasedPeriodrule 
 * @param cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodperiodPeriodrule 
 * @param sendUnderscoreemail 
 * @param assetUnderscoreexpiredUnderscorelimit 
 * @param priorUnderscorenotificationUnderscoreseconds 
 * @param cqPerioddamPeriodexpiryPeriodnotificationPeriodurlPeriodprotocol 
 */
case class ComDayCqDamCoreImplExpiryNotificationJobImplProperties(cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodistimebased: Option[ConfigNodePropertyBoolean],
                cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodtimebasedPeriodrule: Option[ConfigNodePropertyString],
                cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodperiodPeriodrule: Option[ConfigNodePropertyInteger],
                sendUnderscoreemail: Option[ConfigNodePropertyBoolean],
                assetUnderscoreexpiredUnderscorelimit: Option[ConfigNodePropertyInteger],
                priorUnderscorenotificationUnderscoreseconds: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriodexpiryPeriodnotificationPeriodurlPeriodprotocol: Option[ConfigNodePropertyString]
                )

object ComDayCqDamCoreImplExpiryNotificationJobImplProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplExpiryNotificationJobImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplExpiryNotificationJobImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplExpiryNotificationJobImplProperties] = deriveEncoder
}
