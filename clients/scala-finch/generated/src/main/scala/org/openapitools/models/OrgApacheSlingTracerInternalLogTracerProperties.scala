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
 * @param tracerSets 
 * @param enabled 
 * @param servletEnabled 
 * @param recordingCacheSizeInMB 
 * @param recordingCacheDurationInSecs 
 * @param recordingCompressionEnabled 
 * @param gzipResponse 
 */
case class OrgApacheSlingTracerInternalLogTracerProperties(tracerSets: Option[ConfigNodePropertyArray],
                enabled: Option[ConfigNodePropertyBoolean],
                servletEnabled: Option[ConfigNodePropertyBoolean],
                recordingCacheSizeInMB: Option[ConfigNodePropertyInteger],
                recordingCacheDurationInSecs: Option[ConfigNodePropertyInteger],
                recordingCompressionEnabled: Option[ConfigNodePropertyBoolean],
                gzipResponse: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingTracerInternalLogTracerProperties {
    /**
     * Creates the codec for converting OrgApacheSlingTracerInternalLogTracerProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingTracerInternalLogTracerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingTracerInternalLogTracerProperties] = deriveEncoder
}
