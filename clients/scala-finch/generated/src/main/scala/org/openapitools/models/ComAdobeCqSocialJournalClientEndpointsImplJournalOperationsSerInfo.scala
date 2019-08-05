package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties]
                )

object ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo] = deriveEncoder
}
