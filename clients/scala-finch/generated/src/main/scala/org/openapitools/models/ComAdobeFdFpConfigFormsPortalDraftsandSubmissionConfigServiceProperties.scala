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
 * @param portalPeriodoutboxes 
 * @param draftPerioddataPeriodservice 
 * @param draftPeriodmetadataPeriodservice 
 * @param submitPerioddataPeriodservice 
 * @param submitPeriodmetadataPeriodservice 
 * @param pendingSignPerioddataPeriodservice 
 * @param pendingSignPeriodmetadataPeriodservice 
 */
case class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties(portalPeriodoutboxes: Option[ConfigNodePropertyArray],
                draftPerioddataPeriodservice: Option[ConfigNodePropertyString],
                draftPeriodmetadataPeriodservice: Option[ConfigNodePropertyString],
                submitPerioddataPeriodservice: Option[ConfigNodePropertyString],
                submitPeriodmetadataPeriodservice: Option[ConfigNodePropertyString],
                pendingSignPerioddataPeriodservice: Option[ConfigNodePropertyString],
                pendingSignPeriodmetadataPeriodservice: Option[ConfigNodePropertyString]
                )

object ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties {
    /**
     * Creates the codec for converting ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties] = deriveEncoder
}
