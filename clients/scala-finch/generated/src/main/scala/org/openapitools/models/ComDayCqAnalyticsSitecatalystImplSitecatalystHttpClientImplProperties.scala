package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param cqPeriodanalyticsPeriodsitecatalystPeriodservicePerioddatacenterPeriodurl 
 * @param devhostnamepatterns 
 * @param connectionPeriodtimeout 
 * @param socketPeriodtimeout 
 */
case class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties(cqPeriodanalyticsPeriodsitecatalystPeriodservicePerioddatacenterPeriodurl: Option[ConfigNodePropertyArray],
                devhostnamepatterns: Option[ConfigNodePropertyArray],
                connectionPeriodtimeout: Option[ConfigNodePropertyInteger],
                socketPeriodtimeout: Option[ConfigNodePropertyInteger]
                )

object ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties {
    /**
     * Creates the codec for converting ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties] = deriveEncoder
}
