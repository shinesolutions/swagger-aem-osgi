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
 * @param jmxPeriodobjectname 
 */
case class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties(schedulerPeriodexpression: Option[ConfigNodePropertyString],
                jmxPeriodobjectname: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties] = deriveEncoder
}
