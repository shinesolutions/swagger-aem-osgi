package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param mvtstatisticsPeriodtrackingurl 
 */
case class ComDayCqWcmCoreMvtMVTStatisticsImplProperties(mvtstatisticsPeriodtrackingurl: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmCoreMvtMVTStatisticsImplProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreMvtMVTStatisticsImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreMvtMVTStatisticsImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreMvtMVTStatisticsImplProperties] = deriveEncoder
}
