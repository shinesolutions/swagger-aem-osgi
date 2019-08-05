package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param granitePeriodworkflowinboxPeriodsortPeriodpropertyName 
 * @param granitePeriodworkflowinboxPeriodsortPeriodorder 
 * @param cqPeriodworkflowPeriodjobPeriodretry 
 * @param cqPeriodworkflowPeriodsuperuser 
 * @param granitePeriodworkflowPeriodinboxQuerySize 
 * @param granitePeriodworkflowPeriodadminUserGroupFilter 
 * @param granitePeriodworkflowPeriodenforceWorkitemAssigneePermissions 
 * @param granitePeriodworkflowPeriodenforceWorkflowInitiatorPermissions 
 * @param granitePeriodworkflowPeriodinjectTenantIdInJobTopics 
 * @param granitePeriodworkflowPeriodmaxPurgeSaveThreshold 
 * @param granitePeriodworkflowPeriodmaxPurgeQueryCount 
 */
case class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties(granitePeriodworkflowinboxPeriodsortPeriodpropertyName: Option[ConfigNodePropertyDropDown],
                granitePeriodworkflowinboxPeriodsortPeriodorder: Option[ConfigNodePropertyString],
                cqPeriodworkflowPeriodjobPeriodretry: Option[ConfigNodePropertyInteger],
                cqPeriodworkflowPeriodsuperuser: Option[ConfigNodePropertyArray],
                granitePeriodworkflowPeriodinboxQuerySize: Option[ConfigNodePropertyInteger],
                granitePeriodworkflowPeriodadminUserGroupFilter: Option[ConfigNodePropertyBoolean],
                granitePeriodworkflowPeriodenforceWorkitemAssigneePermissions: Option[ConfigNodePropertyBoolean],
                granitePeriodworkflowPeriodenforceWorkflowInitiatorPermissions: Option[ConfigNodePropertyBoolean],
                granitePeriodworkflowPeriodinjectTenantIdInJobTopics: Option[ConfigNodePropertyBoolean],
                granitePeriodworkflowPeriodmaxPurgeSaveThreshold: Option[ConfigNodePropertyInteger],
                granitePeriodworkflowPeriodmaxPurgeQueryCount: Option[ConfigNodePropertyInteger]
                )

object ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties] = deriveEncoder
}
