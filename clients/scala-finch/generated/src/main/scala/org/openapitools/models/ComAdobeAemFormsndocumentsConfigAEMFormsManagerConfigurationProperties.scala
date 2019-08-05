package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param formsManagerConfigPeriodincludeOOTBTemplates 
 * @param formsManagerConfigPeriodincludeDeprecatedTemplates 
 */
case class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties(formsManagerConfigPeriodincludeOOTBTemplates: Option[ConfigNodePropertyBoolean],
                formsManagerConfigPeriodincludeDeprecatedTemplates: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties {
    /**
     * Creates the codec for converting ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties] = deriveEncoder
}
