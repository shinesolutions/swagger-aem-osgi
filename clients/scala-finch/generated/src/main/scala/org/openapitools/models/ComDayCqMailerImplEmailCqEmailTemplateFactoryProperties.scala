package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param mailerPeriodemailPeriodcharset 
 */
case class ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties(mailerPeriodemailPeriodcharset: Option[ConfigNodePropertyString]
                )

object ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties {
    /**
     * Creates the codec for converting ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties] = deriveEncoder
}
