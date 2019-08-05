package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties]
                )

object ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo] = deriveEncoder
}
