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
 * @param Duration for Temporary Storage 
 * @param Duration for Anonymous Storage 
 */
case class ComAdobeFormsCommonServletTempCleanUpTaskProperties(schedulerPeriodexpression: Option[ConfigNodePropertyString],
                Duration for Temporary Storage: Option[ConfigNodePropertyString],
                Duration for Anonymous Storage: Option[ConfigNodePropertyString]
                )

object ComAdobeFormsCommonServletTempCleanUpTaskProperties {
    /**
     * Creates the codec for converting ComAdobeFormsCommonServletTempCleanUpTaskProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeFormsCommonServletTempCleanUpTaskProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeFormsCommonServletTempCleanUpTaskProperties] = deriveEncoder
}
