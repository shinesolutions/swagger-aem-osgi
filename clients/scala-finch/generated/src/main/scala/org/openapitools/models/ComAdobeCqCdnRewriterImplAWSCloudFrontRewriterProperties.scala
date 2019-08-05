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
 * @param keypairPeriodid 
 * @param keypairPeriodalias 
 * @param cdnrewriterPeriodattributes 
 * @param cdnPeriodrewriterPerioddistributionPerioddomain 
 */
case class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties(servicePeriodranking: Option[ConfigNodePropertyInteger],
                keypairPeriodid: Option[ConfigNodePropertyString],
                keypairPeriodalias: Option[ConfigNodePropertyString],
                cdnrewriterPeriodattributes: Option[ConfigNodePropertyArray],
                cdnPeriodrewriterPerioddistributionPerioddomain: Option[ConfigNodePropertyString]
                )

object ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties {
    /**
     * Creates the codec for converting ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties] = deriveEncoder
}
