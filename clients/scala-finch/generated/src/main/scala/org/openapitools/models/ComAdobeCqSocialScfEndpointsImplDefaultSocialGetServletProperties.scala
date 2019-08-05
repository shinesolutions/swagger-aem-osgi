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
 * @param slingPeriodservletPeriodselectors 
 * @param slingPeriodservletPeriodextensions 
 */
case class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties(slingPeriodservletPeriodselectors: Option[ConfigNodePropertyArray],
                slingPeriodservletPeriodextensions: Option[ConfigNodePropertyString]
                )

object ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties] = deriveEncoder
}
