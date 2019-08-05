package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param extensionPeriodorder 
 * @param flushPeriodforumontopic 
 */
case class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties(extensionPeriodorder: Option[ConfigNodePropertyInteger],
                flushPeriodforumontopic: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties] = deriveEncoder
}
