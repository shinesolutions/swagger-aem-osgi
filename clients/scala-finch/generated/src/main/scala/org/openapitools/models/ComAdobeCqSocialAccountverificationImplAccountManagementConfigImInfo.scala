package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties]
                )

object ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo] = deriveEncoder
}
