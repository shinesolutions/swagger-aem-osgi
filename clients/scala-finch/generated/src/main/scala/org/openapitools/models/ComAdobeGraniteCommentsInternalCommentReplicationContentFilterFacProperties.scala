package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param replicatePeriodcommentPeriodresourceTypes 
 */
case class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties(replicatePeriodcommentPeriodresourceTypes: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties] = deriveEncoder
}
