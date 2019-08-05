package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo {
    /**
     * Creates the codec for converting ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo] = deriveEncoder
}
