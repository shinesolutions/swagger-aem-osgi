package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties]
                )

object ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo {
    /**
     * Creates the codec for converting ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo] = deriveEncoder
}
