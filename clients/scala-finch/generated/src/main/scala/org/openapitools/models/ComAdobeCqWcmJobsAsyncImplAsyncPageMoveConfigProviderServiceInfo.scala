package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties]
                )

object ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo {
    /**
     * Creates the codec for converting ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo] = deriveEncoder
}
