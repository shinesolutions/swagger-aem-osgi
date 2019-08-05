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
 */
case class ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties(servicePeriodranking: Option[ConfigNodePropertyInteger],
                tagpattern: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties {
    /**
     * Creates the codec for converting ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties] = deriveEncoder
}
