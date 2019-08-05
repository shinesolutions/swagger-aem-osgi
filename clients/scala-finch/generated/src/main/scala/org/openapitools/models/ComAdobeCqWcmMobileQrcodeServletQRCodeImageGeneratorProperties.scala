package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param cqPeriodwcmPeriodqrcodePeriodservletPeriodwhitelist 
 */
case class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties(cqPeriodwcmPeriodqrcodePeriodservletPeriodwhitelist: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties {
    /**
     * Creates the codec for converting ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties] = deriveEncoder
}
