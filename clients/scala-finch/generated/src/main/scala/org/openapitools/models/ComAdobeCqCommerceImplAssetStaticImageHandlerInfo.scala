package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqCommerceImplAssetStaticImageHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqCommerceImplAssetStaticImageHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqCommerceImplAssetStaticImageHandlerProperties]
                )

object ComAdobeCqCommerceImplAssetStaticImageHandlerInfo {
    /**
     * Creates the codec for converting ComAdobeCqCommerceImplAssetStaticImageHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCommerceImplAssetStaticImageHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCommerceImplAssetStaticImageHandlerInfo] = deriveEncoder
}
