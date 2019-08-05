package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param syncTranslationStatePeriodschedulingFormat 
 * @param schedulingRepeatTranslationPeriodschedulingFormat 
 * @param syncTranslationStatePeriodlockTimeoutInMinutes 
 * @param exportPeriodformat 
 */
case class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties(syncTranslationStatePeriodschedulingFormat: Option[ConfigNodePropertyString],
                schedulingRepeatTranslationPeriodschedulingFormat: Option[ConfigNodePropertyString],
                syncTranslationStatePeriodlockTimeoutInMinutes: Option[ConfigNodePropertyString],
                exportPeriodformat: Option[ConfigNodePropertyDropDown]
                )

object ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties] = deriveEncoder
}
