package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqRewriterProcessorImplHtmlParserFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqRewriterProcessorImplHtmlParserFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqRewriterProcessorImplHtmlParserFactoryProperties]
                )

object ComDayCqRewriterProcessorImplHtmlParserFactoryInfo {
    /**
     * Creates the codec for converting ComDayCqRewriterProcessorImplHtmlParserFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqRewriterProcessorImplHtmlParserFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqRewriterProcessorImplHtmlParserFactoryInfo] = deriveEncoder
}
