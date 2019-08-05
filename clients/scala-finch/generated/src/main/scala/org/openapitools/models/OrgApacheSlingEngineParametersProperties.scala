package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param slingPerioddefaultPeriodparameterPeriodencoding 
 * @param slingPerioddefaultPeriodmaxPeriodparameters 
 * @param filePeriodlocation 
 * @param filePeriodthreshold 
 * @param filePeriodmax 
 * @param requestPeriodmax 
 * @param slingPerioddefaultPeriodparameterPeriodcheckForAdditionalContainerParameters 
 */
case class OrgApacheSlingEngineParametersProperties(slingPerioddefaultPeriodparameterPeriodencoding: Option[ConfigNodePropertyString],
                slingPerioddefaultPeriodmaxPeriodparameters: Option[ConfigNodePropertyInteger],
                filePeriodlocation: Option[ConfigNodePropertyString],
                filePeriodthreshold: Option[ConfigNodePropertyInteger],
                filePeriodmax: Option[ConfigNodePropertyInteger],
                requestPeriodmax: Option[ConfigNodePropertyInteger],
                slingPerioddefaultPeriodparameterPeriodcheckForAdditionalContainerParameters: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingEngineParametersProperties {
    /**
     * Creates the codec for converting OrgApacheSlingEngineParametersProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEngineParametersProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEngineParametersProperties] = deriveEncoder
}
