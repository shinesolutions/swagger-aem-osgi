package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param archivingPeriodenabled 
 * @param schedulerPeriodexpression 
 * @param archivePeriodsincePerioddaysPeriodcompleted 
 */
case class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties(archivingPeriodenabled: Option[ConfigNodePropertyBoolean],
                schedulerPeriodexpression: Option[ConfigNodePropertyString],
                archivePeriodsincePerioddaysPeriodcompleted: Option[ConfigNodePropertyInteger]
                )

object ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties] = deriveEncoder
}
