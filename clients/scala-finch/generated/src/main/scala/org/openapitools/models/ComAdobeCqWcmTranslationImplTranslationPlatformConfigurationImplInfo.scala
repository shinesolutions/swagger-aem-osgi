package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties]
                )

object ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo] = deriveEncoder
}
