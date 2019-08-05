package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqSearchImplBuilderQueryBuilderImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqSearchImplBuilderQueryBuilderImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqSearchImplBuilderQueryBuilderImplProperties]
                )

object ComDayCqSearchImplBuilderQueryBuilderImplInfo {
    /**
     * Creates the codec for converting ComDayCqSearchImplBuilderQueryBuilderImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqSearchImplBuilderQueryBuilderImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqSearchImplBuilderQueryBuilderImplInfo] = deriveEncoder
}
