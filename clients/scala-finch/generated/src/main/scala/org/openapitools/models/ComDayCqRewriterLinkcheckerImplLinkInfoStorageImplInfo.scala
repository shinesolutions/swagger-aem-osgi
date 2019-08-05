package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo {
    /**
     * Creates the codec for converting ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo] = deriveEncoder
}
