package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param slingPeriodservletPeriodextensions 
 * @param slingPeriodservletPeriodpaths 
 * @param slingPeriodservletPeriodmethods 
 */
case class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties(slingPeriodservletPeriodextensions: Option[ConfigNodePropertyString],
                slingPeriodservletPeriodpaths: Option[ConfigNodePropertyString],
                slingPeriodservletPeriodmethods: Option[ConfigNodePropertyString]
                )

object ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties] = deriveEncoder
}
