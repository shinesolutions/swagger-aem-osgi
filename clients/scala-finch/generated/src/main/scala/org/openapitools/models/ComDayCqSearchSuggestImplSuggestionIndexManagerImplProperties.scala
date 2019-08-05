package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param pathBuilderPeriodtarget 
 * @param suggestPeriodbasepath 
 */
case class ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties(pathBuilderPeriodtarget: Option[ConfigNodePropertyString],
                suggestPeriodbasepath: Option[ConfigNodePropertyString]
                )

object ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties {
    /**
     * Creates the codec for converting ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties] = deriveEncoder
}
