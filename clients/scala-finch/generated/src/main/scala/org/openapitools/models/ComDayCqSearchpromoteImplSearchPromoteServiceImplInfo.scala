package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo {
    /**
     * Creates the codec for converting ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo] = deriveEncoder
}
