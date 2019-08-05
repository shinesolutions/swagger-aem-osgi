package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param fieldWhitelist 
 * @param attachmentTypeBlacklist 
 */
case class ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties(fieldWhitelist: Option[ConfigNodePropertyArray],
                attachmentTypeBlacklist: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties] = deriveEncoder
}
