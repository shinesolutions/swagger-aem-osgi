package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param importerPeriodminPeriodinterval 
 * @param importerPerioduser 
 * @param excludePeriodpaths 
 * @param includePeriodpaths 
 */
case class ComDayCqPollingImporterImplPollingImporterImplProperties(importerPeriodminPeriodinterval: Option[ConfigNodePropertyInteger],
                importerPerioduser: Option[ConfigNodePropertyString],
                excludePeriodpaths: Option[ConfigNodePropertyArray],
                includePeriodpaths: Option[ConfigNodePropertyArray]
                )

object ComDayCqPollingImporterImplPollingImporterImplProperties {
    /**
     * Creates the codec for converting ComDayCqPollingImporterImplPollingImporterImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqPollingImporterImplPollingImporterImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqPollingImporterImplPollingImporterImplProperties] = deriveEncoder
}
