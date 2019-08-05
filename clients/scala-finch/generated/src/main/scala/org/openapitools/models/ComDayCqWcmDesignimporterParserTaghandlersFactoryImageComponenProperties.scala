package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param servicePeriodranking 
 * @param tagpattern 
 * @param componentPeriodresourceType 
 */
case class ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties(servicePeriodranking: Option[ConfigNodePropertyInteger],
                tagpattern: Option[ConfigNodePropertyString],
                componentPeriodresourceType: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties {
    /**
     * Creates the codec for converting ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties] = deriveEncoder
}
