package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqAuditPurgeDamProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqAuditPurgeDamInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqAuditPurgeDamProperties]
                )

object ComAdobeCqAuditPurgeDamInfo {
    /**
     * Creates the codec for converting ComAdobeCqAuditPurgeDamInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqAuditPurgeDamInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqAuditPurgeDamInfo] = deriveEncoder
}
