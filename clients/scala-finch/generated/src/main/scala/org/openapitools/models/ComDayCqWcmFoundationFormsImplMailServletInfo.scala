package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmFoundationFormsImplMailServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmFoundationFormsImplMailServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmFoundationFormsImplMailServletProperties]
                )

object ComDayCqWcmFoundationFormsImplMailServletInfo {
    /**
     * Creates the codec for converting ComDayCqWcmFoundationFormsImplMailServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmFoundationFormsImplMailServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmFoundationFormsImplMailServletInfo] = deriveEncoder
}
