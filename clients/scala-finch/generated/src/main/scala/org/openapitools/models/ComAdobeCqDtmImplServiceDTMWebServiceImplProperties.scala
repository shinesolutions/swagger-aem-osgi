package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param connectionPeriodtimeout 
 * @param socketPeriodtimeout 
 */
case class ComAdobeCqDtmImplServiceDTMWebServiceImplProperties(connectionPeriodtimeout: Option[ConfigNodePropertyInteger],
                socketPeriodtimeout: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqDtmImplServiceDTMWebServiceImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqDtmImplServiceDTMWebServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDtmImplServiceDTMWebServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDtmImplServiceDTMWebServiceImplProperties] = deriveEncoder
}
