package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties]
                )

object OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo {
    /**
     * Creates the codec for converting OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo] = deriveEncoder
}
