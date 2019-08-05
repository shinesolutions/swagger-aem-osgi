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
case class ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties(pipelinePeriodtype: Option[ConfigNodePropertyString]
                )

object ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties {
    /**
     * Creates the codec for converting ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties] = deriveEncoder
}
