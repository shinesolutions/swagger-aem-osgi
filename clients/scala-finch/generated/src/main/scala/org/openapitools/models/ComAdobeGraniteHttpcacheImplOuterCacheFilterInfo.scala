package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties]
                )

object ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo] = deriveEncoder
}
