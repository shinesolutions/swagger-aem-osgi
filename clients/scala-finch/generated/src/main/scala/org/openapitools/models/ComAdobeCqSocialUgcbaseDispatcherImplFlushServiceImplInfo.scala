package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties]
                )

object ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo] = deriveEncoder
}
