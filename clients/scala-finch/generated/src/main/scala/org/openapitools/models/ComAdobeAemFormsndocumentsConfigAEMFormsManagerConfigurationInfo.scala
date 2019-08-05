package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties]
                )

object ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo {
    /**
     * Creates the codec for converting ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo] = deriveEncoder
}
