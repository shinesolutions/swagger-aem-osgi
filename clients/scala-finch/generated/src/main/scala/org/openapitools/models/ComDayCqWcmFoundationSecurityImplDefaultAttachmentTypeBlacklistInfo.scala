package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties]
                )

object ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo {
    /**
     * Creates the codec for converting ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo] = deriveEncoder
}
