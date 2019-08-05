package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param eventPeriodfilter 
 * @param minThreadPoolSize 
 * @param maxThreadPoolSize 
 * @param cqPeriodwcmPeriodworkflowPeriodterminatePeriodonPeriodactivate 
 * @param cqPeriodwcmPeriodworklfowPeriodterminatePeriodexclusionPeriodlist 
 */
case class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties(eventPeriodfilter: Option[ConfigNodePropertyString],
                minThreadPoolSize: Option[ConfigNodePropertyInteger],
                maxThreadPoolSize: Option[ConfigNodePropertyInteger],
                cqPeriodwcmPeriodworkflowPeriodterminatePeriodonPeriodactivate: Option[ConfigNodePropertyBoolean],
                cqPeriodwcmPeriodworklfowPeriodterminatePeriodexclusionPeriodlist: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties {
    /**
     * Creates the codec for converting ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties] = deriveEncoder
}
