package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties]
                )

object ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo] = deriveEncoder
}
