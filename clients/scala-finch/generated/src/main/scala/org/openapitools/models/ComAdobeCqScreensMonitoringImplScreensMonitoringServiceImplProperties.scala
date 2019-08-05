package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodprojectPath 
 * @param comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodscheduleFrequency 
 * @param comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodpingTimeout 
 * @param comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodrecipients 
 * @param comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodsmtpserver 
 * @param comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodsmtpport 
 * @param comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodusetls 
 * @param comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodusername 
 * @param comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodpassword 
 */
case class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties(comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodprojectPath: Option[ConfigNodePropertyArray],
                comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodscheduleFrequency: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodpingTimeout: Option[ConfigNodePropertyInteger],
                comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodrecipients: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodsmtpserver: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodsmtpport: Option[ConfigNodePropertyInteger],
                comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodusetls: Option[ConfigNodePropertyBoolean],
                comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodusername: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodpassword: Option[ConfigNodePropertyString]
                )

object ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties] = deriveEncoder
}
