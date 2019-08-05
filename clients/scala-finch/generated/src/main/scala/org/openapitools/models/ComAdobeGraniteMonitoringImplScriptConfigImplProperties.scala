package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param scriptPeriodfilename 
 * @param scriptPerioddisplay 
 * @param scriptPeriodpath 
 * @param scriptPeriodplatform 
 * @param interval 
 * @param jmxdomain 
 */
case class ComAdobeGraniteMonitoringImplScriptConfigImplProperties(scriptPeriodfilename: Option[ConfigNodePropertyString],
                scriptPerioddisplay: Option[ConfigNodePropertyString],
                scriptPeriodpath: Option[ConfigNodePropertyString],
                scriptPeriodplatform: Option[ConfigNodePropertyArray],
                interval: Option[ConfigNodePropertyInteger],
                jmxdomain: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteMonitoringImplScriptConfigImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteMonitoringImplScriptConfigImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteMonitoringImplScriptConfigImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteMonitoringImplScriptConfigImplProperties] = deriveEncoder
}
