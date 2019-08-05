package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties]
                )

object ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo {
    /**
     * Creates the codec for converting ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo] = deriveEncoder
}
