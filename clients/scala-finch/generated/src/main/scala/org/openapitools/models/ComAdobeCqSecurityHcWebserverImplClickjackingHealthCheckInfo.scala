package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties]
                )

object ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo {
    /**
     * Creates the codec for converting ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo] = deriveEncoder
}
