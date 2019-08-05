package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo {
    /**
     * Creates the codec for converting ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo] = deriveEncoder
}
