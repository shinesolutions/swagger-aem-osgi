package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties]
                )

object ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo] = deriveEncoder
}
