package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmScriptingImplBVPManagerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmScriptingImplBVPManagerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmScriptingImplBVPManagerProperties]
                )

object ComDayCqWcmScriptingImplBVPManagerInfo {
    /**
     * Creates the codec for converting ComDayCqWcmScriptingImplBVPManagerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmScriptingImplBVPManagerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmScriptingImplBVPManagerInfo] = deriveEncoder
}
