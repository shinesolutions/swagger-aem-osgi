package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param repcachePeriodenable 
 * @param repcachePeriodttl 
 * @param repcachePeriodmax 
 */
case class ComDayCqReportingImplCacheCacheImplProperties(repcachePeriodenable: Option[ConfigNodePropertyBoolean],
                repcachePeriodttl: Option[ConfigNodePropertyInteger],
                repcachePeriodmax: Option[ConfigNodePropertyInteger]
                )

object ComDayCqReportingImplCacheCacheImplProperties {
    /**
     * Creates the codec for converting ComDayCqReportingImplCacheCacheImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReportingImplCacheCacheImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReportingImplCacheCacheImplProperties] = deriveEncoder
}
