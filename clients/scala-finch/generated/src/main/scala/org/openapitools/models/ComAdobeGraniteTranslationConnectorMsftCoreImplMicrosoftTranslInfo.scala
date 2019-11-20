package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties]
                )

object ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo] = deriveEncoder
}