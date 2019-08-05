package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param enabled 
 * @param fallbackPaths 
 */
case class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties(enabled: Option[ConfigNodePropertyBoolean],
                fallbackPaths: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties] = deriveEncoder
}
