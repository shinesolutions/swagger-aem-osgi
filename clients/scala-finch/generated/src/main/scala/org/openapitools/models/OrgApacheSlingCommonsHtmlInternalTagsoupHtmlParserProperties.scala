package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param parserPeriodfeatures 
 */
case class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties(parserPeriodfeatures: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties] = deriveEncoder
}
