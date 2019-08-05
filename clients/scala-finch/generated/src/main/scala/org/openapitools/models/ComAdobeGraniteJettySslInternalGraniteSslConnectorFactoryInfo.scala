package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param additionalProperties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties],
                additionalProperties: Option[String],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo] = deriveEncoder
}
