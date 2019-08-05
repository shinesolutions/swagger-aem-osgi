package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties]
                )

object ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo {
    /**
     * Creates the codec for converting ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo] = deriveEncoder
}
