package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param htmlparserPeriodprocessTags 
 * @param htmlparserPeriodpreserveCamelCase 
 */
case class ComDayCqRewriterProcessorImplHtmlParserFactoryProperties(htmlparserPeriodprocessTags: Option[ConfigNodePropertyArray],
                htmlparserPeriodpreserveCamelCase: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqRewriterProcessorImplHtmlParserFactoryProperties {
    /**
     * Creates the codec for converting ComDayCqRewriterProcessorImplHtmlParserFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqRewriterProcessorImplHtmlParserFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqRewriterProcessorImplHtmlParserFactoryProperties] = deriveEncoder
}
