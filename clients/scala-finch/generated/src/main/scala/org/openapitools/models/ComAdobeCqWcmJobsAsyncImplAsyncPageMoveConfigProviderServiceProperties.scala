package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param threshold 
 * @param jobTopicName 
 * @param emailEnabled 
 */
case class ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties(threshold: Option[ConfigNodePropertyInteger],
                jobTopicName: Option[ConfigNodePropertyString],
                emailEnabled: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties {
    /**
     * Creates the codec for converting ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties] = deriveEncoder
}
