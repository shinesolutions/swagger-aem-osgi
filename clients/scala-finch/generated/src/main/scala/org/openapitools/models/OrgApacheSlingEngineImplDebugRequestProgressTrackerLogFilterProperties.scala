package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param extensions 
 * @param minDurationMs 
 * @param maxDurationMs 
 * @param compactLogFormat 
 */
case class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties(extensions: Option[ConfigNodePropertyArray],
                minDurationMs: Option[ConfigNodePropertyInteger],
                maxDurationMs: Option[ConfigNodePropertyInteger],
                compactLogFormat: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties {
    /**
     * Creates the codec for converting OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties] = deriveEncoder
}
