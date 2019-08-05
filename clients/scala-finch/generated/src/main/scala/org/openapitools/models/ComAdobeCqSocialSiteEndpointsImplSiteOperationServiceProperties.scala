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
 * @param fieldWhitelist 
 * @param sitePathFilters 
 * @param sitePackageGroup 
 */
case class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties(fieldWhitelist: Option[ConfigNodePropertyArray],
                sitePathFilters: Option[ConfigNodePropertyArray],
                sitePackageGroup: Option[ConfigNodePropertyString]
                )

object ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties] = deriveEncoder
}
