package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties]
                )

object ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo {
    /**
     * Creates the codec for converting ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo] = deriveEncoder
}
