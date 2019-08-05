package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties]
                )

object ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo] = deriveEncoder
}
