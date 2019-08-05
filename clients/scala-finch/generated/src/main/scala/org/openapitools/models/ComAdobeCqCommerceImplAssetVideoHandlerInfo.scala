package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqCommerceImplAssetVideoHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqCommerceImplAssetVideoHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqCommerceImplAssetVideoHandlerProperties]
                )

object ComAdobeCqCommerceImplAssetVideoHandlerInfo {
    /**
     * Creates the codec for converting ComAdobeCqCommerceImplAssetVideoHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCommerceImplAssetVideoHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCommerceImplAssetVideoHandlerInfo] = deriveEncoder
}
