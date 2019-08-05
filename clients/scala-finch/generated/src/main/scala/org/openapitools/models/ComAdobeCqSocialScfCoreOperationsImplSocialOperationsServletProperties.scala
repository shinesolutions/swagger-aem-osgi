package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param slingPeriodservletPeriodselectors 
 * @param slingPeriodservletPeriodextensions 
 */
case class ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties(slingPeriodservletPeriodselectors: Option[ConfigNodePropertyString],
                slingPeriodservletPeriodextensions: Option[ConfigNodePropertyString]
                )

object ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties] = deriveEncoder
}
