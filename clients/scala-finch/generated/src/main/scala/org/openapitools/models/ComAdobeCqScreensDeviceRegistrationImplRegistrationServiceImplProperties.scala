package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param deviceRegistrationTimeout 
 */
case class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties(deviceRegistrationTimeout: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties] = deriveEncoder
}
