package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param eventPeriodfilter 
 * @param launchesPeriodeventhandlerPeriodthreadpoolPeriodmaxsize 
 * @param launchesPeriodeventhandlerPeriodthreadpoolPeriodpriority 
 * @param launchesPeriodeventhandlerPeriodupdatelastmodification 
 */
case class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties(eventPeriodfilter: Option[ConfigNodePropertyString],
                launchesPeriodeventhandlerPeriodthreadpoolPeriodmaxsize: Option[ConfigNodePropertyInteger],
                launchesPeriodeventhandlerPeriodthreadpoolPeriodpriority: Option[ConfigNodePropertyDropDown],
                launchesPeriodeventhandlerPeriodupdatelastmodification: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties {
    /**
     * Creates the codec for converting ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties] = deriveEncoder
}
