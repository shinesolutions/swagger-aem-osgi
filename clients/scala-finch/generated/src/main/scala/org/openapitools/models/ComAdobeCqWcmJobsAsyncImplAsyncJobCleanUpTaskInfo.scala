package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties]
                )

object ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo {
    /**
     * Creates the codec for converting ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo] = deriveEncoder
}
