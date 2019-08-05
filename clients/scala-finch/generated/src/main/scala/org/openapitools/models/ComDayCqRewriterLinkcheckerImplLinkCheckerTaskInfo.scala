package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties]
                )

object ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo {
    /**
     * Creates the codec for converting ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo] = deriveEncoder
}
