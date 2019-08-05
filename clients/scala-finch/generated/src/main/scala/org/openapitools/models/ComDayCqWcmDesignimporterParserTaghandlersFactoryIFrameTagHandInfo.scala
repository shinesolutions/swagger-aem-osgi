package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties]
                )

object ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo {
    /**
     * Creates the codec for converting ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo] = deriveEncoder
}
