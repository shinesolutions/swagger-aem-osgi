package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param formsPeriodformparagraphpostprocessorPeriodenabled 
 * @param formsPeriodformparagraphpostprocessorPeriodformresourcetypes 
 */
case class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties(formsPeriodformparagraphpostprocessorPeriodenabled: Option[ConfigNodePropertyBoolean],
                formsPeriodformparagraphpostprocessorPeriodformresourcetypes: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties {
    /**
     * Creates the codec for converting ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties] = deriveEncoder
}
