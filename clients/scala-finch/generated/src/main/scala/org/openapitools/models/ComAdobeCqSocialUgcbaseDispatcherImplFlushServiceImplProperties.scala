package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param threadPoolSize 
 * @param delayTime 
 * @param workerSleepTime 
 */
case class ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties(threadPoolSize: Option[ConfigNodePropertyInteger],
                delayTime: Option[ConfigNodePropertyInteger],
                workerSleepTime: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties] = deriveEncoder
}
