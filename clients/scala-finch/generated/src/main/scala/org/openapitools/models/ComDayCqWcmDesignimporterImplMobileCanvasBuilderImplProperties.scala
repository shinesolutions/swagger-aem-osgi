package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param filepattern 
 * @param devicePeriodgroups 
 * @param buildPeriodpagePeriodnodes 
 * @param buildPeriodclientPeriodlibs 
 * @param buildPeriodcanvasPeriodcomponent 
 */
case class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties(filepattern: Option[ConfigNodePropertyString],
                devicePeriodgroups: Option[ConfigNodePropertyArray],
                buildPeriodpagePeriodnodes: Option[ConfigNodePropertyBoolean],
                buildPeriodclientPeriodlibs: Option[ConfigNodePropertyBoolean],
                buildPeriodcanvasPeriodcomponent: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties {
    /**
     * Creates the codec for converting ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties] = deriveEncoder
}
