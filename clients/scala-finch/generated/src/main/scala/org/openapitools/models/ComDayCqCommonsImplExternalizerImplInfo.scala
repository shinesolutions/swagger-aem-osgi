package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqCommonsImplExternalizerImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqCommonsImplExternalizerImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqCommonsImplExternalizerImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqCommonsImplExternalizerImplInfo {
    /**
     * Creates the codec for converting ComDayCqCommonsImplExternalizerImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqCommonsImplExternalizerImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqCommonsImplExternalizerImplInfo] = deriveEncoder
}
