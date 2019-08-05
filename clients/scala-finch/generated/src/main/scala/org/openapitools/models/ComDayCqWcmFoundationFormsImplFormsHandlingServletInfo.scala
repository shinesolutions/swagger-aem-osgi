package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties]
                )

object ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo {
    /**
     * Creates the codec for converting ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo] = deriveEncoder
}
