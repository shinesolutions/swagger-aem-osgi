package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties]
                )

object ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo {
    /**
     * Creates the codec for converting ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo] = deriveEncoder
}
