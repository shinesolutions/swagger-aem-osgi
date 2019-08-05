package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param eventPeriodtopics 
 * @param eventPeriodfilter 
 * @param translatePeriodlistenerPeriodtype 
 * @param translatePeriodpropertyPeriodlist 
 * @param poolSize 
 * @param maxPoolSize 
 * @param queueSize 
 * @param keepAliveTime 
 */
case class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties(eventPeriodtopics: Option[ConfigNodePropertyString],
                eventPeriodfilter: Option[ConfigNodePropertyString],
                translatePeriodlistenerPeriodtype: Option[ConfigNodePropertyArray],
                translatePeriodpropertyPeriodlist: Option[ConfigNodePropertyArray],
                poolSize: Option[ConfigNodePropertyInteger],
                maxPoolSize: Option[ConfigNodePropertyInteger],
                queueSize: Option[ConfigNodePropertyInteger],
                keepAliveTime: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties] = deriveEncoder
}
