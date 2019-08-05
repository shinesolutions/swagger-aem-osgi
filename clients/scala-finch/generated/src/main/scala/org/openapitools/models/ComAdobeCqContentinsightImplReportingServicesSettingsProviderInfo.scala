package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties]
                )

object ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo {
    /**
     * Creates the codec for converting ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo] = deriveEncoder
}
