package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param resourcePeriodtypes 
 */
case class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties(resourcePeriodtypes: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties {
    /**
     * Creates the codec for converting ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties] = deriveEncoder
}
