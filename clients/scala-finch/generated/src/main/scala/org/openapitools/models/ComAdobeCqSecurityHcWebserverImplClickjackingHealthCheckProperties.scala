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
 * @param hcPeriodtags 
 * @param webserverPeriodaddress 
 */
case class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties(hcPeriodtags: Option[ConfigNodePropertyArray],
                webserverPeriodaddress: Option[ConfigNodePropertyString]
                )

object ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties] = deriveEncoder
}
