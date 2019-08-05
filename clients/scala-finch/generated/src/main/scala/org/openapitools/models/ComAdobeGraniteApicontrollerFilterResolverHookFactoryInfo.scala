package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo] = deriveEncoder
}
