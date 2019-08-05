package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties]
                )

object ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo] = deriveEncoder
}
