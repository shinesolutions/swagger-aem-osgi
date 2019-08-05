package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param additionalProperties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties],
                additionalProperties: Option[String],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo {
    /**
     * Creates the codec for converting ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo] = deriveEncoder
}
