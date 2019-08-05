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
case class ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties(servicePeriodranking: Option[ConfigNodePropertyInteger],
                tagpattern: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties {
    /**
     * Creates the codec for converting ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties] = deriveEncoder
}
