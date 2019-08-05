package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param MaxRetry 
 * @param fieldWhitelist 
 * @param attachmentTypeBlacklist 
 */
case class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties(MaxRetry: Option[ConfigNodePropertyInteger],
                fieldWhitelist: Option[ConfigNodePropertyArray],
                attachmentTypeBlacklist: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties] = deriveEncoder
}
