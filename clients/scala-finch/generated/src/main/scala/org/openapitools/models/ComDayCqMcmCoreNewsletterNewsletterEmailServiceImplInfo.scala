package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties]
                )

object ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo {
    /**
     * Creates the codec for converting ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo] = deriveEncoder
}
