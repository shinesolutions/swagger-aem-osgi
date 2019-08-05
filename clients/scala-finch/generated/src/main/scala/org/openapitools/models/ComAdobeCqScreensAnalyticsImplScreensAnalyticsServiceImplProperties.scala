package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodurl 
 * @param comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodapikey 
 * @param comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodproject 
 * @param comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodenvironment 
 * @param comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodsendFrequency 
 */
case class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties(comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodurl: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodapikey: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodproject: Option[ConfigNodePropertyString],
                comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodenvironment: Option[ConfigNodePropertyDropDown],
                comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodsendFrequency: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties] = deriveEncoder
}
