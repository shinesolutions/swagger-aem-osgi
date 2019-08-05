package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param commitsTrackerWriterGroups 
 */
case class OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties(commitsTrackerWriterGroups: Option[ConfigNodePropertyArray]
                )

object OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties] = deriveEncoder
}
