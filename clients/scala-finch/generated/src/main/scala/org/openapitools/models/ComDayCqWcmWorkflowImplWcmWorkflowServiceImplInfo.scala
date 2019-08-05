package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties]
                )

object ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo {
    /**
     * Creates the codec for converting ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo] = deriveEncoder
}
