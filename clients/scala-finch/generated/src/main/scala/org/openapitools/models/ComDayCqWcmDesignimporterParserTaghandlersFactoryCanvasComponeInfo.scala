package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties]
                )

object ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo {
    /**
     * Creates the codec for converting ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo] = deriveEncoder
}
