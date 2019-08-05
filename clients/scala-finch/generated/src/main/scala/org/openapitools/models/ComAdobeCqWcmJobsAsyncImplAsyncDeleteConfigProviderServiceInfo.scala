package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties]
                )

object ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo {
    /**
     * Creates the codec for converting ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo] = deriveEncoder
}
