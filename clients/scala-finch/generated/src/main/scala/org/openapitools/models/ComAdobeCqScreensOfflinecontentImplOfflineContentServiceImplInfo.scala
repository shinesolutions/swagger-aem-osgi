package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties]
                )

object ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo] = deriveEncoder
}
