package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties]
                )

object ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo] = deriveEncoder
}
