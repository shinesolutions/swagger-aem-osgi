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
 * @param hcPeriodtags 
 * @param dispatcherPeriodaddress 
 * @param dispatcherPeriodfilterPeriodallowed 
 * @param dispatcherPeriodfilterPeriodblocked 
 */
case class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties(hcPeriodtags: Option[ConfigNodePropertyArray],
                dispatcherPeriodaddress: Option[ConfigNodePropertyString],
                dispatcherPeriodfilterPeriodallowed: Option[ConfigNodePropertyArray],
                dispatcherPeriodfilterPeriodblocked: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties] = deriveEncoder
}
