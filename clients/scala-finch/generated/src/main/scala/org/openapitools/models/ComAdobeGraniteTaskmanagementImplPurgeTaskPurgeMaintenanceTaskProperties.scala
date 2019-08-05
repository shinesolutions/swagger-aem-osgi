package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param purgeCompleted 
 * @param completedAge 
 * @param purgeActive 
 * @param activeAge 
 * @param saveThreshold 
 */
case class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties(purgeCompleted: Option[ConfigNodePropertyBoolean],
                completedAge: Option[ConfigNodePropertyInteger],
                purgeActive: Option[ConfigNodePropertyBoolean],
                activeAge: Option[ConfigNodePropertyInteger],
                saveThreshold: Option[ConfigNodePropertyInteger]
                )

object ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties] = deriveEncoder
}
