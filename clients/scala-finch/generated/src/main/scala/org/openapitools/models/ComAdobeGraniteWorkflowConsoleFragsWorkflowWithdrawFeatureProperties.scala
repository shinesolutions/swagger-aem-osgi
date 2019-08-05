package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param enabled 
 */
case class ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties(enabled: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties] = deriveEncoder
}
