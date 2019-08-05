package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties]
                )

object ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo] = deriveEncoder
}
