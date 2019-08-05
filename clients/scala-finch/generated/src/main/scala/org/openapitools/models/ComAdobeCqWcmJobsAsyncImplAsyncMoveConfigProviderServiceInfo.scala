package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties]
                )

object ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo {
    /**
     * Creates the codec for converting ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo] = deriveEncoder
}
