package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param endpointUri 
 * @param connectionTimeout 
 * @param socketTimeout 
 */
case class ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties(endpointUri: Option[ConfigNodePropertyString],
                connectionTimeout: Option[ConfigNodePropertyInteger],
                socketTimeout: Option[ConfigNodePropertyInteger]
                )

object ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties {
    /**
     * Creates the codec for converting ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties] = deriveEncoder
}
