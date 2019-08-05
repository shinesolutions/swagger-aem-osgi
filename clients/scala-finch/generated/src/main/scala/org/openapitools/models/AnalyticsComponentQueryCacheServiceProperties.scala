package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param cqPeriodanalyticsPeriodcomponentPeriodqueryPeriodcachePeriodsize 
 */
case class AnalyticsComponentQueryCacheServiceProperties(cqPeriodanalyticsPeriodcomponentPeriodqueryPeriodcachePeriodsize: Option[ConfigNodePropertyInteger]
                )

object AnalyticsComponentQueryCacheServiceProperties {
    /**
     * Creates the codec for converting AnalyticsComponentQueryCacheServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[AnalyticsComponentQueryCacheServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[AnalyticsComponentQueryCacheServiceProperties] = deriveEncoder
}
