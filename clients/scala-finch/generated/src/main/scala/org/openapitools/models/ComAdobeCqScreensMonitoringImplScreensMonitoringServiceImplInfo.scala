package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties]
                )

object ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo] = deriveEncoder
}
