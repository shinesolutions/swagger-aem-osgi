package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param getSystemWorkflowModels 
 * @param getPackageRootPath 
 */
case class ComAdobeGraniteWorkflowCorePayloadMapCacheProperties(getSystemWorkflowModels: Option[ConfigNodePropertyArray],
                getPackageRootPath: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteWorkflowCorePayloadMapCacheProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowCorePayloadMapCacheProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowCorePayloadMapCacheProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowCorePayloadMapCacheProperties] = deriveEncoder
}
