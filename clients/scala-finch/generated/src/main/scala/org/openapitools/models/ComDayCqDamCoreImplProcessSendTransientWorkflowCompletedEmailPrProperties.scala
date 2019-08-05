package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param processPeriodlabel 
 * @param Notify on Complete 
 */
case class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties(processPeriodlabel: Option[ConfigNodePropertyString],
                Notify on Complete: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties] = deriveEncoder
}
