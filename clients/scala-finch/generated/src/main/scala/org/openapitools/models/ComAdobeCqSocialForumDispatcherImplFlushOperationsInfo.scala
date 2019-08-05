package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties]
                )

object ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo] = deriveEncoder
}
