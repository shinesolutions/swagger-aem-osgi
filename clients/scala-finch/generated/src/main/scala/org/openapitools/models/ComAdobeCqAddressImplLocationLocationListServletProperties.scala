package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param cqPeriodaddressPeriodlocationPerioddefaultPeriodmaxResults 
 */
case class ComAdobeCqAddressImplLocationLocationListServletProperties(cqPeriodaddressPeriodlocationPerioddefaultPeriodmaxResults: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqAddressImplLocationLocationListServletProperties {
    /**
     * Creates the codec for converting ComAdobeCqAddressImplLocationLocationListServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqAddressImplLocationLocationListServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqAddressImplLocationLocationListServletProperties] = deriveEncoder
}
