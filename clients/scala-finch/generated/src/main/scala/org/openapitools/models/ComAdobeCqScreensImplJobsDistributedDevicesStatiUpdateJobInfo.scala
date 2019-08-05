package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties]
                )

object ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo {
    /**
     * Creates the codec for converting ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo] = deriveEncoder
}
