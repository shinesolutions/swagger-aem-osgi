package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param adapterPeriodcondition 
 * @param taskmanagerPeriodadmingroups 
 */
case class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties(adapterPeriodcondition: Option[ConfigNodePropertyString],
                taskmanagerPeriodadmingroups: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties] = deriveEncoder
}
