package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param cdnPeriodconfigPerioddistributionPerioddomain 
 * @param cdnPeriodconfigPeriodenablePeriodrewriting 
 * @param cdnPeriodconfigPeriodpathPeriodprefixes 
 * @param cdnPeriodconfigPeriodcdnttl 
 * @param cdnPeriodconfigPeriodapplicationPeriodprotocol 
 */
case class ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties(cdnPeriodconfigPerioddistributionPerioddomain: Option[ConfigNodePropertyString],
                cdnPeriodconfigPeriodenablePeriodrewriting: Option[ConfigNodePropertyBoolean],
                cdnPeriodconfigPeriodpathPeriodprefixes: Option[ConfigNodePropertyArray],
                cdnPeriodconfigPeriodcdnttl: Option[ConfigNodePropertyInteger],
                cdnPeriodconfigPeriodapplicationPeriodprotocol: Option[ConfigNodePropertyString]
                )

object ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties] = deriveEncoder
}
