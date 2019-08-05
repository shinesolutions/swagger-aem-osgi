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
 * @param excludePeriodsearchPeriodpath 
 */
case class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties(hcPeriodtags: Option[ConfigNodePropertyArray],
                excludePeriodsearchPeriodpath: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties] = deriveEncoder
}
