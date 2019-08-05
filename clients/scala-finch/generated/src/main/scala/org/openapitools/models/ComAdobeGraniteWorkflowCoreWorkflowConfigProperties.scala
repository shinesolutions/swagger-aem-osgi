package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param cqPeriodworkflowPeriodconfigPeriodworkflowPeriodpackagesPeriodrootPeriodpath 
 * @param cqPeriodworkflowPeriodconfigPeriodworkflowPeriodprocessPeriodlegacyPeriodmode 
 * @param cqPeriodworkflowPeriodconfigPeriodallowPeriodlocking 
 */
case class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties(cqPeriodworkflowPeriodconfigPeriodworkflowPeriodpackagesPeriodrootPeriodpath: Option[ConfigNodePropertyArray],
                cqPeriodworkflowPeriodconfigPeriodworkflowPeriodprocessPeriodlegacyPeriodmode: Option[ConfigNodePropertyBoolean],
                cqPeriodworkflowPeriodconfigPeriodallowPeriodlocking: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteWorkflowCoreWorkflowConfigProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowCoreWorkflowConfigProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowCoreWorkflowConfigProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowCoreWorkflowConfigProperties] = deriveEncoder
}
