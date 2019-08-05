package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties]
                )

object ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo {
    /**
     * Creates the codec for converting ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo] = deriveEncoder
}
