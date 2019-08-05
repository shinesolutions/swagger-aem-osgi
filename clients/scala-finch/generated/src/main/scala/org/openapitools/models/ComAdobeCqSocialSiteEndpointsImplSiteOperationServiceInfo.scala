package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties]
                )

object ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo] = deriveEncoder
}
