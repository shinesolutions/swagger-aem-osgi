package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties]
                )

object ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo {
    /**
     * Creates the codec for converting ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo] = deriveEncoder
}
