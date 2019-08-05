package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties]
                )

object ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo] = deriveEncoder
}
