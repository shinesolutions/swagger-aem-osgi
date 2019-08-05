package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamInddImplServletSnippetCreationServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamInddImplServletSnippetCreationServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamInddImplServletSnippetCreationServletProperties]
                )

object ComDayCqDamInddImplServletSnippetCreationServletInfo {
    /**
     * Creates the codec for converting ComDayCqDamInddImplServletSnippetCreationServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamInddImplServletSnippetCreationServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamInddImplServletSnippetCreationServletInfo] = deriveEncoder
}
