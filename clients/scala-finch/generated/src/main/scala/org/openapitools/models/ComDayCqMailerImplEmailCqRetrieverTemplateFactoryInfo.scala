package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties]
                )

object ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo {
    /**
     * Creates the codec for converting ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo] = deriveEncoder
}
