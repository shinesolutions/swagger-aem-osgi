package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param linkPeriodexpiredPeriodprefix 
 * @param linkPeriodexpiredPeriodremove 
 * @param linkPeriodexpiredPeriodsuffix 
 * @param linkPeriodinvalidPeriodprefix 
 * @param linkPeriodinvalidPeriodremove 
 * @param linkPeriodinvalidPeriodsuffix 
 * @param linkPeriodpredatedPeriodprefix 
 * @param linkPeriodpredatedPeriodremove 
 * @param linkPeriodpredatedPeriodsuffix 
 * @param linkPeriodwcmmodes 
 */
case class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties(linkPeriodexpiredPeriodprefix: Option[ConfigNodePropertyString],
                linkPeriodexpiredPeriodremove: Option[ConfigNodePropertyBoolean],
                linkPeriodexpiredPeriodsuffix: Option[ConfigNodePropertyString],
                linkPeriodinvalidPeriodprefix: Option[ConfigNodePropertyString],
                linkPeriodinvalidPeriodremove: Option[ConfigNodePropertyBoolean],
                linkPeriodinvalidPeriodsuffix: Option[ConfigNodePropertyString],
                linkPeriodpredatedPeriodprefix: Option[ConfigNodePropertyString],
                linkPeriodpredatedPeriodremove: Option[ConfigNodePropertyBoolean],
                linkPeriodpredatedPeriodsuffix: Option[ConfigNodePropertyString],
                linkPeriodwcmmodes: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties] = deriveEncoder
}
