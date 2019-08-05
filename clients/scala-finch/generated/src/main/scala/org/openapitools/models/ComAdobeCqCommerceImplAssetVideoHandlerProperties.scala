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
case class ComAdobeCqCommerceImplAssetVideoHandlerProperties(cqPeriodcommercePeriodassetPeriodhandlerPeriodactive: Option[ConfigNodePropertyBoolean],
                cqPeriodcommercePeriodassetPeriodhandlerPeriodname: Option[ConfigNodePropertyString]
                )

object ComAdobeCqCommerceImplAssetVideoHandlerProperties {
    /**
     * Creates the codec for converting ComAdobeCqCommerceImplAssetVideoHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCommerceImplAssetVideoHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCommerceImplAssetVideoHandlerProperties] = deriveEncoder
}
