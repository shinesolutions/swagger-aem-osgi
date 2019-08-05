package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param workflowpackageinfoproviderPeriodfilter 
 * @param workflowpackageinfoproviderPeriodfilterPeriodrootpath 
 */
case class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties(workflowpackageinfoproviderPeriodfilter: Option[ConfigNodePropertyArray],
                workflowpackageinfoproviderPeriodfilterPeriodrootpath: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties {
    /**
     * Creates the codec for converting ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties] = deriveEncoder
}
