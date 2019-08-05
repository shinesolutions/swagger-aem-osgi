package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param eventPeriodtopics 
 * @param eventPeriodfilter 
 * @param verbs 
 */
case class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties(eventPeriodtopics: Option[ConfigNodePropertyString],
                eventPeriodfilter: Option[ConfigNodePropertyString],
                verbs: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties] = deriveEncoder
}
