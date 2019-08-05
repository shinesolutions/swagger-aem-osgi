package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties]
                )

object ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo {
    /**
     * Creates the codec for converting ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo] = deriveEncoder
}
