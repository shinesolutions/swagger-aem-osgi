package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param dtmPeriodstagingPeriodipPeriodwhitelist 
 * @param dtmPeriodproductionPeriodipPeriodwhitelist 
 */
case class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties(dtmPeriodstagingPeriodipPeriodwhitelist: Option[ConfigNodePropertyArray],
                dtmPeriodproductionPeriodipPeriodwhitelist: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqDtmImplServletsDTMDeployHookServletProperties {
    /**
     * Creates the codec for converting ComAdobeCqDtmImplServletsDTMDeployHookServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDtmImplServletsDTMDeployHookServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDtmImplServletsDTMDeployHookServletProperties] = deriveEncoder
}
