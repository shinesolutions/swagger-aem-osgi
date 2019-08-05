package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param poolSize 
 * @param maxPoolSize 
 * @param queueSize 
 * @param keepAliveTime 
 */
case class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties(poolSize: Option[ConfigNodePropertyInteger],
                maxPoolSize: Option[ConfigNodePropertyInteger],
                queueSize: Option[ConfigNodePropertyInteger],
                keepAliveTime: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties] = deriveEncoder
}
