package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param id 
 * @param enabled 
 * @param reference 
 * @param interval 
 * @param expression 
 * @param source 
 * @param target 
 * @param login 
 * @param password 
 */
case class ComDayCqPollingImporterImplManagedPollConfigImplProperties(id: Option[ConfigNodePropertyString],
                enabled: Option[ConfigNodePropertyBoolean],
                reference: Option[ConfigNodePropertyBoolean],
                interval: Option[ConfigNodePropertyInteger],
                expression: Option[ConfigNodePropertyString],
                source: Option[ConfigNodePropertyString],
                target: Option[ConfigNodePropertyString],
                login: Option[ConfigNodePropertyString],
                password: Option[ConfigNodePropertyString]
                )

object ComDayCqPollingImporterImplManagedPollConfigImplProperties {
    /**
     * Creates the codec for converting ComDayCqPollingImporterImplManagedPollConfigImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqPollingImporterImplManagedPollConfigImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqPollingImporterImplManagedPollConfigImplProperties] = deriveEncoder
}
