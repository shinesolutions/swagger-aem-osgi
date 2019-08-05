package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqAuditPurgeReplicationProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqAuditPurgeReplicationInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqAuditPurgeReplicationProperties]
                )

object ComAdobeCqAuditPurgeReplicationInfo {
    /**
     * Creates the codec for converting ComAdobeCqAuditPurgeReplicationInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqAuditPurgeReplicationInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqAuditPurgeReplicationInfo] = deriveEncoder
}
