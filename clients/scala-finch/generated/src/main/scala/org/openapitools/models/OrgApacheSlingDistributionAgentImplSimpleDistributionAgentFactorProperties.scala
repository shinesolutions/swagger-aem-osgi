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
 * @param name 
 * @param title 
 * @param details 
 * @param enabled 
 * @param serviceName 
 * @param logPeriodlevel 
 * @param queuePeriodprocessingPeriodenabled 
 * @param packageExporterPeriodtarget 
 * @param packageImporterPeriodtarget 
 * @param requestAuthorizationStrategyPeriodtarget 
 * @param triggersPeriodtarget 
 */
case class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties(name: Option[ConfigNodePropertyString],
                title: Option[ConfigNodePropertyString],
                details: Option[ConfigNodePropertyString],
                enabled: Option[ConfigNodePropertyBoolean],
                serviceName: Option[ConfigNodePropertyString],
                logPeriodlevel: Option[ConfigNodePropertyDropDown],
                queuePeriodprocessingPeriodenabled: Option[ConfigNodePropertyBoolean],
                packageExporterPeriodtarget: Option[ConfigNodePropertyString],
                packageImporterPeriodtarget: Option[ConfigNodePropertyString],
                requestAuthorizationStrategyPeriodtarget: Option[ConfigNodePropertyString],
                triggersPeriodtarget: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties] = deriveEncoder
}
