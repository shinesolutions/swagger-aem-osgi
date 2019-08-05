package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param schedulerPeriodperiod 
 * @param schedulerPeriodconcurrent 
 * @param servicePeriodbadUnderscorelinkUnderscoretoleranceUnderscoreinterval 
 * @param servicePeriodcheckUnderscoreoverrideUnderscorepatterns 
 * @param servicePeriodcacheUnderscorebrokenUnderscoreinternalUnderscorelinks 
 * @param servicePeriodspecialUnderscorelinkUnderscoreprefix 
 * @param servicePeriodspecialUnderscorelinkUnderscorepatterns 
 */
case class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties(schedulerPeriodperiod: Option[ConfigNodePropertyInteger],
                schedulerPeriodconcurrent: Option[ConfigNodePropertyBoolean],
                servicePeriodbadUnderscorelinkUnderscoretoleranceUnderscoreinterval: Option[ConfigNodePropertyInteger],
                servicePeriodcheckUnderscoreoverrideUnderscorepatterns: Option[ConfigNodePropertyArray],
                servicePeriodcacheUnderscorebrokenUnderscoreinternalUnderscorelinks: Option[ConfigNodePropertyBoolean],
                servicePeriodspecialUnderscorelinkUnderscoreprefix: Option[ConfigNodePropertyArray],
                servicePeriodspecialUnderscorelinkUnderscorepatterns: Option[ConfigNodePropertyArray]
                )

object ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties {
    /**
     * Creates the codec for converting ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties] = deriveEncoder
}
