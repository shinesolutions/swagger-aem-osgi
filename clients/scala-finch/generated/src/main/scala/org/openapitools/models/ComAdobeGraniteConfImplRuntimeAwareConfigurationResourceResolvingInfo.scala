package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties]
                )

object ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo] = deriveEncoder
}
