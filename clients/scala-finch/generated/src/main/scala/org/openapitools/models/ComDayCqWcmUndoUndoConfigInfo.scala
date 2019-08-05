package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmUndoUndoConfigProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqWcmUndoUndoConfigInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmUndoUndoConfigProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqWcmUndoUndoConfigInfo {
    /**
     * Creates the codec for converting ComDayCqWcmUndoUndoConfigInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmUndoUndoConfigInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmUndoUndoConfigInfo] = deriveEncoder
}
