package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties]
                )

object ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo {
    /**
     * Creates the codec for converting ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo] = deriveEncoder
}
