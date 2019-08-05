package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties]
                )

object ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo {
    /**
     * Creates the codec for converting ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo] = deriveEncoder
}
