package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param defaultPeriodtransportPeriodagentMinustoMinusworkerPeriodprefix 
 * @param defaultPeriodtransportPeriodagentMinustoMinusmasterPeriodprefix 
 * @param defaultPeriodtransportPeriodinputPeriodpackage 
 * @param defaultPeriodtransportPeriodoutputPeriodpackage 
 * @param defaultPeriodtransportPeriodreplicationPeriodsynchronous 
 * @param defaultPeriodtransportPeriodcontentpackage 
 * @param offloadingPeriodtransporterPerioddefaultPeriodenabled 
 */
case class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties(defaultPeriodtransportPeriodagentMinustoMinusworkerPeriodprefix: Option[ConfigNodePropertyString],
                defaultPeriodtransportPeriodagentMinustoMinusmasterPeriodprefix: Option[ConfigNodePropertyString],
                defaultPeriodtransportPeriodinputPeriodpackage: Option[ConfigNodePropertyString],
                defaultPeriodtransportPeriodoutputPeriodpackage: Option[ConfigNodePropertyString],
                defaultPeriodtransportPeriodreplicationPeriodsynchronous: Option[ConfigNodePropertyBoolean],
                defaultPeriodtransportPeriodcontentpackage: Option[ConfigNodePropertyBoolean],
                offloadingPeriodtransporterPerioddefaultPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties] = deriveEncoder
}
