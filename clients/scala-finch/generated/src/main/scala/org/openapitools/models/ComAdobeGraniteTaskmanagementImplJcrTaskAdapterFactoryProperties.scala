package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param adapterPeriodcondition 
 */
case class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties(adapterPeriodcondition: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties] = deriveEncoder
}
