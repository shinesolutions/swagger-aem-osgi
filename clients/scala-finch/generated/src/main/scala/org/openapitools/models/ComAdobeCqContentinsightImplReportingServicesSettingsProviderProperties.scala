package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param reportingservicesPeriodurl 
 */
case class ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties(reportingservicesPeriodurl: Option[ConfigNodePropertyString]
                )

object ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties {
    /**
     * Creates the codec for converting ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties] = deriveEncoder
}
