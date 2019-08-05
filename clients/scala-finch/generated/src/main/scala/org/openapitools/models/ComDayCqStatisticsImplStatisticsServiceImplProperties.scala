package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param schedulerPeriodperiod 
 * @param schedulerPeriodconcurrent 
 * @param path 
 * @param workspace 
 * @param keywordsPath 
 * @param asyncEntries 
 */
case class ComDayCqStatisticsImplStatisticsServiceImplProperties(schedulerPeriodperiod: Option[ConfigNodePropertyInteger],
                schedulerPeriodconcurrent: Option[ConfigNodePropertyBoolean],
                path: Option[ConfigNodePropertyString],
                workspace: Option[ConfigNodePropertyString],
                keywordsPath: Option[ConfigNodePropertyString],
                asyncEntries: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqStatisticsImplStatisticsServiceImplProperties {
    /**
     * Creates the codec for converting ComDayCqStatisticsImplStatisticsServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqStatisticsImplStatisticsServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqStatisticsImplStatisticsServiceImplProperties] = deriveEncoder
}
