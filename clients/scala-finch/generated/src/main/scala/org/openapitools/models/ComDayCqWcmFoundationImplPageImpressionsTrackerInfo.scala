package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmFoundationImplPageImpressionsTrackerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmFoundationImplPageImpressionsTrackerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmFoundationImplPageImpressionsTrackerProperties]
                )

object ComDayCqWcmFoundationImplPageImpressionsTrackerInfo {
    /**
     * Creates the codec for converting ComDayCqWcmFoundationImplPageImpressionsTrackerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmFoundationImplPageImpressionsTrackerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmFoundationImplPageImpressionsTrackerInfo] = deriveEncoder
}
