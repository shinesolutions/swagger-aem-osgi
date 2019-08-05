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
 * @param hcPeriodname 
 * @param hcPeriodtags 
 * @param hcPeriodmbeanPeriodname 
 * @param packagePeriodnames 
 */
case class ComAdobeCqHcContentPackagesHealthCheckProperties(hcPeriodname: Option[ConfigNodePropertyString],
                hcPeriodtags: Option[ConfigNodePropertyArray],
                hcPeriodmbeanPeriodname: Option[ConfigNodePropertyString],
                packagePeriodnames: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqHcContentPackagesHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeCqHcContentPackagesHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqHcContentPackagesHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqHcContentPackagesHealthCheckProperties] = deriveEncoder
}
