package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodport 
 * @param comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodkeystorePerioduser 
 * @param comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodkeystorePeriodpassword 
 * @param comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodciphersuitesPeriodexcluded 
 * @param comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodciphersuitesPeriodincluded 
 * @param comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodclientPeriodcertificate 
 */
case class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties(comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodport: Option[ConfigNodePropertyInteger],
                comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodkeystorePerioduser: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodkeystorePeriodpassword: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodciphersuitesPeriodexcluded: Option[ConfigNodePropertyArray],
                comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodciphersuitesPeriodincluded: Option[ConfigNodePropertyArray],
                comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodclientPeriodcertificate: Option[ConfigNodePropertyDropDown]
                )

object ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties] = deriveEncoder
}
