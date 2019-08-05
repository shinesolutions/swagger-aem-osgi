package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param translationFactory 
 * @param defaultConnectorLabel 
 * @param defaultConnectorAttribution 
 * @param defaultConnectorWorkspaceId 
 * @param defaultConnectorSubscriptionKey 
 * @param languageMapLocation 
 * @param categoryMapLocation 
 * @param retryAttempts 
 * @param timeoutCount 
 */
case class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties(translationFactory: Option[ConfigNodePropertyString],
                defaultConnectorLabel: Option[ConfigNodePropertyString],
                defaultConnectorAttribution: Option[ConfigNodePropertyString],
                defaultConnectorWorkspaceId: Option[ConfigNodePropertyString],
                defaultConnectorSubscriptionKey: Option[ConfigNodePropertyString],
                languageMapLocation: Option[ConfigNodePropertyString],
                categoryMapLocation: Option[ConfigNodePropertyString],
                retryAttempts: Option[ConfigNodePropertyInteger],
                timeoutCount: Option[ConfigNodePropertyInteger]
                )

object ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties] = deriveEncoder
}
