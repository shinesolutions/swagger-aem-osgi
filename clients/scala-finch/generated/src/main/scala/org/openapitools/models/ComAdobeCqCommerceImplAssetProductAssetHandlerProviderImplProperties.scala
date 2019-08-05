package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param cqPeriodcommercePeriodassetPeriodhandlerPeriodfallback 
 */
case class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties(cqPeriodcommercePeriodassetPeriodhandlerPeriodfallback: Option[ConfigNodePropertyString]
                )

object ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties] = deriveEncoder
}
