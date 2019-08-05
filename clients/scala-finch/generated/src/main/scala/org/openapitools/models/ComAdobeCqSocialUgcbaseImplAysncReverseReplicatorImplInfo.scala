package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties]
                )

object ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo] = deriveEncoder
}
