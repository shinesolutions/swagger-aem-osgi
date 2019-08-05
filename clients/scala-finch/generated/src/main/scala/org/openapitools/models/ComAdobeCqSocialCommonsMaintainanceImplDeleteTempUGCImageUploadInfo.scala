package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties]
                )

object ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo] = deriveEncoder
}
