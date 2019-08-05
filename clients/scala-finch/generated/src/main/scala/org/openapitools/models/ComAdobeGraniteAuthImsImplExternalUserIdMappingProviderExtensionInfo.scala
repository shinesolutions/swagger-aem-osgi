package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties]
                )

object ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo] = deriveEncoder
}
