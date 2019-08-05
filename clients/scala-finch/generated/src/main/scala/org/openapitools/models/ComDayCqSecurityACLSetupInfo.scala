package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqSecurityACLSetupProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqSecurityACLSetupInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqSecurityACLSetupProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqSecurityACLSetupInfo {
    /**
     * Creates the codec for converting ComDayCqSecurityACLSetupInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqSecurityACLSetupInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqSecurityACLSetupInfo] = deriveEncoder
}
