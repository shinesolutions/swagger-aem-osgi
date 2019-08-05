package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeFormsCommonServiceImplDefaultDataProviderProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeFormsCommonServiceImplDefaultDataProviderInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeFormsCommonServiceImplDefaultDataProviderProperties]
                )

object ComAdobeFormsCommonServiceImplDefaultDataProviderInfo {
    /**
     * Creates the codec for converting ComAdobeFormsCommonServiceImplDefaultDataProviderInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeFormsCommonServiceImplDefaultDataProviderInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeFormsCommonServiceImplDefaultDataProviderInfo] = deriveEncoder
}
