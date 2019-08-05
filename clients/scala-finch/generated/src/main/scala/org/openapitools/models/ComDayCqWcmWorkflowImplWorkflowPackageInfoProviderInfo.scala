package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties]
                )

object ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo {
    /**
     * Creates the codec for converting ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo] = deriveEncoder
}
