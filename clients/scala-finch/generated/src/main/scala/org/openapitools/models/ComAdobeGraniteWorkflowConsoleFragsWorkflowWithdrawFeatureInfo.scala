package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties]
                )

object ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo] = deriveEncoder
}
