package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyDropDown

/**
 * 
 * @param Feed generator algorithm 
 */
case class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties(Feed generator algorithm: Option[ConfigNodePropertyDropDown]
                )

object ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties] = deriveEncoder
}
