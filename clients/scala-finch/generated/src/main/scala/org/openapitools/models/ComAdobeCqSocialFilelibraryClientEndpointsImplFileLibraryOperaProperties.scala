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
case class ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties(fieldWhitelist: Option[ConfigNodePropertyArray],
                attachmentTypeBlacklist: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties] = deriveEncoder
}
