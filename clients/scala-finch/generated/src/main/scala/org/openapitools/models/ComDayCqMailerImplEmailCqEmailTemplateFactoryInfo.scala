package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties]
                )

object ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo {
    /**
     * Creates the codec for converting ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo] = deriveEncoder
}
