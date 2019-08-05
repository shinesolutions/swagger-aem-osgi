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
 * @param clusterPeriodlevelPeriodenable 
 * @param clusterPeriodmasterPeriodlevel 
 * @param clusterPeriodslavePeriodlevel 
 */
case class ComDayCqJcrclustersupportClusterStartLevelControllerProperties(clusterPeriodlevelPeriodenable: Option[ConfigNodePropertyBoolean],
                clusterPeriodmasterPeriodlevel: Option[ConfigNodePropertyInteger],
                clusterPeriodslavePeriodlevel: Option[ConfigNodePropertyInteger]
                )

object ComDayCqJcrclustersupportClusterStartLevelControllerProperties {
    /**
     * Creates the codec for converting ComDayCqJcrclustersupportClusterStartLevelControllerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqJcrclustersupportClusterStartLevelControllerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqJcrclustersupportClusterStartLevelControllerProperties] = deriveEncoder
}
