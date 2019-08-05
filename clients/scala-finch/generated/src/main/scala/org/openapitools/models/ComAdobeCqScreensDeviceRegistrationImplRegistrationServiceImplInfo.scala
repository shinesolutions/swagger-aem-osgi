package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties]
                )

object ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo] = deriveEncoder
}
