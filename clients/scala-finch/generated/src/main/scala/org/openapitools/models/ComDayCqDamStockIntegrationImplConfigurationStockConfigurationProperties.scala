package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param name 
 * @param locale 
 * @param imsConfig 
 */
case class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties(name: Option[ConfigNodePropertyString],
                locale: Option[ConfigNodePropertyString],
                imsConfig: Option[ConfigNodePropertyString]
                )

object ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties {
    /**
     * Creates the codec for converting ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties] = deriveEncoder
}
