package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param auditlogPeriodrulePeriodname 
 * @param auditlogPeriodrulePeriodcontentpath 
 * @param auditlogPeriodrulePeriodminimumage 
 * @param auditlogPeriodrulePeriodtypes 
 */
case class ComAdobeCqAuditPurgePagesProperties(auditlogPeriodrulePeriodname: Option[ConfigNodePropertyString],
                auditlogPeriodrulePeriodcontentpath: Option[ConfigNodePropertyString],
                auditlogPeriodrulePeriodminimumage: Option[ConfigNodePropertyInteger],
                auditlogPeriodrulePeriodtypes: Option[ConfigNodePropertyDropDown]
                )

object ComAdobeCqAuditPurgePagesProperties {
    /**
     * Creates the codec for converting ComAdobeCqAuditPurgePagesProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqAuditPurgePagesProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqAuditPurgePagesProperties] = deriveEncoder
}
