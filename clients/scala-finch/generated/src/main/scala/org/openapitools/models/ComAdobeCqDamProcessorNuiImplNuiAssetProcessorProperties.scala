package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param nuiEnabled 
 * @param nuiServiceUrl 
 * @param nuiApiKey 
 */
case class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties(nuiEnabled: Option[ConfigNodePropertyBoolean],
                nuiServiceUrl: Option[ConfigNodePropertyString],
                nuiApiKey: Option[ConfigNodePropertyString]
                )

object ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties {
    /**
     * Creates the codec for converting ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties] = deriveEncoder
}
