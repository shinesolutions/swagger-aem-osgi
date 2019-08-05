package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqAuditPurgePagesProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqAuditPurgePagesInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqAuditPurgePagesProperties]
                )

object ComAdobeCqAuditPurgePagesInfo {
    /**
     * Creates the codec for converting ComAdobeCqAuditPurgePagesInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqAuditPurgePagesInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqAuditPurgePagesInfo] = deriveEncoder
}
