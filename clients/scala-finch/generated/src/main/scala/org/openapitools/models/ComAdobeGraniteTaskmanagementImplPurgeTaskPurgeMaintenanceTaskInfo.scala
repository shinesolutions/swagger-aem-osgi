package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties]
                )

object ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo] = deriveEncoder
}
