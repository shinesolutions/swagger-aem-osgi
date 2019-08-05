package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties]
                )

object ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo {
    /**
     * Creates the codec for converting ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo] = deriveEncoder
}
