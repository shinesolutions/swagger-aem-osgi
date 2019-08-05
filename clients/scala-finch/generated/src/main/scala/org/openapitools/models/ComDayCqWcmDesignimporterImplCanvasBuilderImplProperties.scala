package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param filepattern 
 * @param buildPeriodpagePeriodnodes 
 * @param buildPeriodclientPeriodlibs 
 * @param buildPeriodcanvasPeriodcomponent 
 */
case class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties(filepattern: Option[ConfigNodePropertyString],
                buildPeriodpagePeriodnodes: Option[ConfigNodePropertyBoolean],
                buildPeriodclientPeriodlibs: Option[ConfigNodePropertyBoolean],
                buildPeriodcanvasPeriodcomponent: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties {
    /**
     * Creates the codec for converting ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties] = deriveEncoder
}
