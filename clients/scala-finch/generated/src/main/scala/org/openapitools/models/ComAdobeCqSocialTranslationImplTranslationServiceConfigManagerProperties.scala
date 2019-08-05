package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param translatePeriodlanguage 
 * @param translatePerioddisplay 
 * @param translatePeriodattribution 
 * @param translatePeriodcaching 
 * @param translatePeriodsmartPeriodrendering 
 * @param translatePeriodcachingPeriodduration 
 * @param translatePeriodsessionPeriodsavePeriodinterval 
 * @param translatePeriodsessionPeriodsavePeriodbatchLimit 
 */
case class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties(translatePeriodlanguage: Option[ConfigNodePropertyDropDown],
                translatePerioddisplay: Option[ConfigNodePropertyDropDown],
                translatePeriodattribution: Option[ConfigNodePropertyBoolean],
                translatePeriodcaching: Option[ConfigNodePropertyDropDown],
                translatePeriodsmartPeriodrendering: Option[ConfigNodePropertyDropDown],
                translatePeriodcachingPeriodduration: Option[ConfigNodePropertyString],
                translatePeriodsessionPeriodsavePeriodinterval: Option[ConfigNodePropertyString],
                translatePeriodsessionPeriodsavePeriodbatchLimit: Option[ConfigNodePropertyString]
                )

object ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties] = deriveEncoder
}
