package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param requestPeriodlogPeriodservicePeriodformat 
 * @param requestPeriodlogPeriodservicePeriodoutput 
 * @param requestPeriodlogPeriodservicePeriodoutputtype 
 * @param requestPeriodlogPeriodservicePeriodonentry 
 */
case class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties(requestPeriodlogPeriodservicePeriodformat: Option[ConfigNodePropertyString],
                requestPeriodlogPeriodservicePeriodoutput: Option[ConfigNodePropertyString],
                requestPeriodlogPeriodservicePeriodoutputtype: Option[ConfigNodePropertyDropDown],
                requestPeriodlogPeriodservicePeriodonentry: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingEngineImplLogRequestLoggerServiceProperties {
    /**
     * Creates the codec for converting OrgApacheSlingEngineImplLogRequestLoggerServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEngineImplLogRequestLoggerServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEngineImplLogRequestLoggerServiceProperties] = deriveEncoder
}
