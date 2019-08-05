package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param schedulerPeriodexpression 
 */
case class ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties(schedulerPeriodexpression: Option[ConfigNodePropertyString]
                )

object ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties {
    /**
     * Creates the codec for converting ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties] = deriveEncoder
}
