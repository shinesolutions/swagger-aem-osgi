package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param cqPeriodcommercePeriodpageeventlistenerPeriodenabled 
 */
case class ComAdobeCqCommercePimImplPageEventListenerProperties(cqPeriodcommercePeriodpageeventlistenerPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeCqCommercePimImplPageEventListenerProperties {
    /**
     * Creates the codec for converting ComAdobeCqCommercePimImplPageEventListenerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCommercePimImplPageEventListenerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCommercePimImplPageEventListenerProperties] = deriveEncoder
}
