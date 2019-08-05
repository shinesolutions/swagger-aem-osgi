package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties]
                )

object ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo] = deriveEncoder
}
