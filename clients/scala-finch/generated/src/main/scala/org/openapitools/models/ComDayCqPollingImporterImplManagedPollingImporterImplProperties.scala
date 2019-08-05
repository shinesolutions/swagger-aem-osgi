package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param importerPerioduser 
 */
case class ComDayCqPollingImporterImplManagedPollingImporterImplProperties(importerPerioduser: Option[ConfigNodePropertyString]
                )

object ComDayCqPollingImporterImplManagedPollingImporterImplProperties {
    /**
     * Creates the codec for converting ComDayCqPollingImporterImplManagedPollingImporterImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqPollingImporterImplManagedPollingImporterImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqPollingImporterImplManagedPollingImporterImplProperties] = deriveEncoder
}
