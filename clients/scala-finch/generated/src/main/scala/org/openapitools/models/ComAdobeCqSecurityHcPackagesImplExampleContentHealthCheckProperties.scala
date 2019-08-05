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
case class ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties(hcPeriodtags: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties] = deriveEncoder
}
