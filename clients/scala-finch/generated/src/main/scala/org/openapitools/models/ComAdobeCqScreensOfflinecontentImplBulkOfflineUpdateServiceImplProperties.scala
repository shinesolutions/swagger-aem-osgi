package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param comPeriodadobePeriodcqPeriodscreensPeriodofflinecontentPeriodimplPeriodBulkOfflineUpdateServiceImplPeriodprojectPath 
 * @param comPeriodadobePeriodcqPeriodscreensPeriodofflinecontentPeriodimplPeriodBulkOfflineUpdateServiceImplPeriodscheduleFrequency 
 */
case class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties(comPeriodadobePeriodcqPeriodscreensPeriodofflinecontentPeriodimplPeriodBulkOfflineUpdateServiceImplPeriodprojectPath: Option[ConfigNodePropertyArray],
                comPeriodadobePeriodcqPeriodscreensPeriodofflinecontentPeriodimplPeriodBulkOfflineUpdateServiceImplPeriodscheduleFrequency: Option[ConfigNodePropertyString]
                )

object ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties] = deriveEncoder
}
