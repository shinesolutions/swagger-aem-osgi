package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties]
                )

object ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo {
    /**
     * Creates the codec for converting ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo] = deriveEncoder
}
