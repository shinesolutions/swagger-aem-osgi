package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties]
                )

object OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo] = deriveEncoder
}
