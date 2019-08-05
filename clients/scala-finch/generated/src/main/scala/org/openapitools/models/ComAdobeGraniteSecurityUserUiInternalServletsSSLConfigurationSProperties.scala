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
case class ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties(hcPeriodtags: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties] = deriveEncoder
}
