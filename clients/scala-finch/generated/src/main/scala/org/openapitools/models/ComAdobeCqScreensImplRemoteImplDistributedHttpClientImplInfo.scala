package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties]
                )

object ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo] = deriveEncoder
}
