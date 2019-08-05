package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param pagePeriodinfoPeriodproviderPeriodpropertyPeriodregexPerioddefault 
 * @param pagePeriodinfoPeriodproviderPeriodpropertyPeriodname 
 */
case class ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties(pagePeriodinfoPeriodproviderPeriodpropertyPeriodregexPerioddefault: Option[ConfigNodePropertyString],
                pagePeriodinfoPeriodproviderPeriodpropertyPeriodname: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties] = deriveEncoder
}
