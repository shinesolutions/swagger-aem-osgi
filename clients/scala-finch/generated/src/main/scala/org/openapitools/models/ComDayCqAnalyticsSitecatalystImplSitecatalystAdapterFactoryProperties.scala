package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param cqPeriodanalyticsPeriodadapterfactoryPeriodcontextstores 
 */
case class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties(cqPeriodanalyticsPeriodadapterfactoryPeriodcontextstores: Option[ConfigNodePropertyArray]
                )

object ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties {
    /**
     * Creates the codec for converting ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties] = deriveEncoder
}
