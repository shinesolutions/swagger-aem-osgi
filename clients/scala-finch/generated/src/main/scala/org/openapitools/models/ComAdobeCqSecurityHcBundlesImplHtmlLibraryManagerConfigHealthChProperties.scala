package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param hcPeriodtags 
 */
case class ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties(hcPeriodtags: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties {
    /**
     * Creates the codec for converting ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties] = deriveEncoder
}
