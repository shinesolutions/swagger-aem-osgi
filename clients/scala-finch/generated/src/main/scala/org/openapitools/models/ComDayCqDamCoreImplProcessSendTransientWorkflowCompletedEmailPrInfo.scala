package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties]
                )

object ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo] = deriveEncoder
}
