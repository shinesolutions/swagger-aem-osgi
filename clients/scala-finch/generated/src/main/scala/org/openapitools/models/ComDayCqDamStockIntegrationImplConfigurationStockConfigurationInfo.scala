package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties]
                )

object ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo {
    /**
     * Creates the codec for converting ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo] = deriveEncoder
}
