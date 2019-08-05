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
 * @param requestPeriodlogPeriodoutput 
 * @param requestPeriodlogPeriodoutputtype 
 * @param requestPeriodlogPeriodenabled 
 * @param accessPeriodlogPeriodoutput 
 * @param accessPeriodlogPeriodoutputtype 
 * @param accessPeriodlogPeriodenabled 
 */
case class OrgApacheSlingEngineImplLogRequestLoggerProperties(requestPeriodlogPeriodoutput: Option[ConfigNodePropertyString],
                requestPeriodlogPeriodoutputtype: Option[ConfigNodePropertyDropDown],
                requestPeriodlogPeriodenabled: Option[ConfigNodePropertyBoolean],
                accessPeriodlogPeriodoutput: Option[ConfigNodePropertyString],
                accessPeriodlogPeriodoutputtype: Option[ConfigNodePropertyDropDown],
                accessPeriodlogPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingEngineImplLogRequestLoggerProperties {
    /**
     * Creates the codec for converting OrgApacheSlingEngineImplLogRequestLoggerProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEngineImplLogRequestLoggerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEngineImplLogRequestLoggerProperties] = deriveEncoder
}
