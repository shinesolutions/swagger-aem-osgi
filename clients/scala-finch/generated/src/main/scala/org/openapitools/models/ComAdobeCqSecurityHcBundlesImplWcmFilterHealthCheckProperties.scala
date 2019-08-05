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
case class ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties(hcPeriodtags: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties] = deriveEncoder
}
