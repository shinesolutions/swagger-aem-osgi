package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties]
                )

object ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo] = deriveEncoder
}
