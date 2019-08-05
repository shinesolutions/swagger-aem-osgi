package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties]
                )

object ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo {
    /**
     * Creates the codec for converting ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo] = deriveEncoder
}
