package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param cqPeriodcommercePeriodassetPeriodhandlerPeriodactive 
 * @param cqPeriodcommercePeriodassetPeriodhandlerPeriodname 
 */
case class ComAdobeCqCommerceImplAssetStaticImageHandlerProperties(cqPeriodcommercePeriodassetPeriodhandlerPeriodactive: Option[ConfigNodePropertyBoolean],
                cqPeriodcommercePeriodassetPeriodhandlerPeriodname: Option[ConfigNodePropertyString]
                )

object ComAdobeCqCommerceImplAssetStaticImageHandlerProperties {
    /**
     * Creates the codec for converting ComAdobeCqCommerceImplAssetStaticImageHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCommerceImplAssetStaticImageHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCommerceImplAssetStaticImageHandlerProperties] = deriveEncoder
}
