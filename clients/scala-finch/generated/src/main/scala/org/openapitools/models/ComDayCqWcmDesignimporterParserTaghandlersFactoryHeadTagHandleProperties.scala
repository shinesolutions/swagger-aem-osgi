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
case class ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties(servicePeriodranking: Option[ConfigNodePropertyInteger],
                tagpattern: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties {
    /**
     * Creates the codec for converting ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties] = deriveEncoder
}
