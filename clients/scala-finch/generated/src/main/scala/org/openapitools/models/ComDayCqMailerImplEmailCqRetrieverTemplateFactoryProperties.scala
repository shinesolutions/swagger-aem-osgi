package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param mailerPeriodemailPeriodembed 
 * @param mailerPeriodemailPeriodcharset 
 * @param mailerPeriodemailPeriodretrieverUserID 
 * @param mailerPeriodemailPeriodretrieverUserPWD 
 */
case class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties(mailerPeriodemailPeriodembed: Option[ConfigNodePropertyBoolean],
                mailerPeriodemailPeriodcharset: Option[ConfigNodePropertyString],
                mailerPeriodemailPeriodretrieverUserID: Option[ConfigNodePropertyString],
                mailerPeriodemailPeriodretrieverUserPWD: Option[ConfigNodePropertyString]
                )

object ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties {
    /**
     * Creates the codec for converting ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties] = deriveEncoder
}
