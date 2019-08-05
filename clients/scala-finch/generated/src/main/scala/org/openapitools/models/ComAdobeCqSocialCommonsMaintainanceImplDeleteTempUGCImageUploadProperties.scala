package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param numberOfDays 
 * @param ageOfFile 
 */
case class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties(numberOfDays: Option[ConfigNodePropertyInteger],
                ageOfFile: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties] = deriveEncoder
}
