package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteHttpcacheFileFileCacheStoreProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteHttpcacheFileFileCacheStoreInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteHttpcacheFileFileCacheStoreProperties]
                )

object ComAdobeGraniteHttpcacheFileFileCacheStoreInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteHttpcacheFileFileCacheStoreInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteHttpcacheFileFileCacheStoreInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteHttpcacheFileFileCacheStoreInfo] = deriveEncoder
}
