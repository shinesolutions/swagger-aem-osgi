package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties]
                )

object ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo {
    /**
     * Creates the codec for converting ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo] = deriveEncoder
}
