package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties]
                )

object ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo] = deriveEncoder
}
