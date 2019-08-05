package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties]
                )

object ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo] = deriveEncoder
}
