package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param checkInternval 
 * @param excludeIds 
 * @param encryptPing 
 */
case class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties(checkInternval: Option[ConfigNodePropertyInteger],
                excludeIds: Option[ConfigNodePropertyArray],
                encryptPing: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteLicenseImplLicenseCheckFilterProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteLicenseImplLicenseCheckFilterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteLicenseImplLicenseCheckFilterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteLicenseImplLicenseCheckFilterProperties] = deriveEncoder
}
