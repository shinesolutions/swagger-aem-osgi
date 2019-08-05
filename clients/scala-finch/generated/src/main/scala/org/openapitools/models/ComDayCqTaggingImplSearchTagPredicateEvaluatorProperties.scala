package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param ignoreUnderscorepath 
 */
case class ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties(ignoreUnderscorepath: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties {
    /**
     * Creates the codec for converting ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties] = deriveEncoder
}
