package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param servicePeriodranking 
 * @param cdnrewriterPeriodattributes 
 * @param cdnPeriodrewriterPerioddistributionPerioddomain 
 */
case class ComAdobeCqCdnRewriterImplCDNRewriterProperties(servicePeriodranking: Option[ConfigNodePropertyInteger],
                cdnrewriterPeriodattributes: Option[ConfigNodePropertyArray],
                cdnPeriodrewriterPerioddistributionPerioddomain: Option[ConfigNodePropertyString]
                )

object ComAdobeCqCdnRewriterImplCDNRewriterProperties {
    /**
     * Creates the codec for converting ComAdobeCqCdnRewriterImplCDNRewriterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCdnRewriterImplCDNRewriterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCdnRewriterImplCDNRewriterProperties] = deriveEncoder
}
