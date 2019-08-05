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
case class ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties(pipelinePeriodtype: Option[ConfigNodePropertyString]
                )

object ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties {
    /**
     * Creates the codec for converting ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties] = deriveEncoder
}
