package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqScheduledExporterImplScheduledExporterImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqScheduledExporterImplScheduledExporterImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqScheduledExporterImplScheduledExporterImplProperties]
                )

object ComAdobeCqScheduledExporterImplScheduledExporterImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqScheduledExporterImplScheduledExporterImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScheduledExporterImplScheduledExporterImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScheduledExporterImplScheduledExporterImplInfo] = deriveEncoder
}
