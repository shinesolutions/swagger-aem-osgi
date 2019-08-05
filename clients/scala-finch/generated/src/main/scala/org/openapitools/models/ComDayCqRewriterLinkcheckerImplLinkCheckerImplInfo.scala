package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo {
    /**
     * Creates the codec for converting ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo] = deriveEncoder
}
