package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param reportingservicesPeriodproxyPeriodwhitelist 
 */
case class ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties(reportingservicesPeriodproxyPeriodwhitelist: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties {
    /**
     * Creates the codec for converting ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties] = deriveEncoder
}
