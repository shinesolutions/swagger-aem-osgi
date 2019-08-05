package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmFoundationFormsImplFormChooserServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmFoundationFormsImplFormChooserServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmFoundationFormsImplFormChooserServletProperties]
                )

object ComDayCqWcmFoundationFormsImplFormChooserServletInfo {
    /**
     * Creates the codec for converting ComDayCqWcmFoundationFormsImplFormChooserServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmFoundationFormsImplFormChooserServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmFoundationFormsImplFormChooserServletInfo] = deriveEncoder
}
