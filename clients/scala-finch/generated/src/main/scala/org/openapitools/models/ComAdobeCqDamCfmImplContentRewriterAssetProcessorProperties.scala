package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param pipelinePeriodtype 
 */
case class ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties(pipelinePeriodtype: Option[ConfigNodePropertyString]
                )

object ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties {
    /**
     * Creates the codec for converting ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties] = deriveEncoder
}
