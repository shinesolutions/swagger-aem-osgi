package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties]
                )

object ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo {
    /**
     * Creates the codec for converting ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo] = deriveEncoder
}
