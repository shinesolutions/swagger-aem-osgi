package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqAccountImplAccountManagementServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqAccountImplAccountManagementServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqAccountImplAccountManagementServletProperties]
                )

object ComAdobeCqAccountImplAccountManagementServletInfo {
    /**
     * Creates the codec for converting ComAdobeCqAccountImplAccountManagementServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqAccountImplAccountManagementServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqAccountImplAccountManagementServletInfo] = deriveEncoder
}
