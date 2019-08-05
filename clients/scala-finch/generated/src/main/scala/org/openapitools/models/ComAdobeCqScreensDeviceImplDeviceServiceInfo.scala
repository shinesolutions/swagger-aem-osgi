package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqScreensDeviceImplDeviceServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqScreensDeviceImplDeviceServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqScreensDeviceImplDeviceServiceProperties]
                )

object ComAdobeCqScreensDeviceImplDeviceServiceInfo {
    /**
     * Creates the codec for converting ComAdobeCqScreensDeviceImplDeviceServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensDeviceImplDeviceServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensDeviceImplDeviceServiceInfo] = deriveEncoder
}
