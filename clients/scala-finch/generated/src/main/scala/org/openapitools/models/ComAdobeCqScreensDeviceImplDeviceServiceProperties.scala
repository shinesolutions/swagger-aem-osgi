package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param comPeriodadobePeriodaemPeriodscreensPeriodplayerPeriodpingfrequency 
 * @param comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodspecialchars 
 * @param comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminlowercasechars 
 * @param comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminuppercasechars 
 * @param comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminnumberchars 
 * @param comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminspecialchars 
 * @param comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminlength 
 */
case class ComAdobeCqScreensDeviceImplDeviceServiceProperties(comPeriodadobePeriodaemPeriodscreensPeriodplayerPeriodpingfrequency: Option[ConfigNodePropertyInteger],
                comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodspecialchars: Option[ConfigNodePropertyString],
                comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminlowercasechars: Option[ConfigNodePropertyInteger],
                comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminuppercasechars: Option[ConfigNodePropertyInteger],
                comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminnumberchars: Option[ConfigNodePropertyInteger],
                comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminspecialchars: Option[ConfigNodePropertyInteger],
                comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminlength: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqScreensDeviceImplDeviceServiceProperties {
    /**
     * Creates the codec for converting ComAdobeCqScreensDeviceImplDeviceServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensDeviceImplDeviceServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensDeviceImplDeviceServiceProperties] = deriveEncoder
}
