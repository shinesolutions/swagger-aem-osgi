package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyFloat
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param orgPeriodapachePeriodfelixPeriodeventadminPeriodThreadPoolSize 
 * @param orgPeriodapachePeriodfelixPeriodeventadminPeriodAsyncToSyncThreadRatio 
 * @param orgPeriodapachePeriodfelixPeriodeventadminPeriodTimeout 
 * @param orgPeriodapachePeriodfelixPeriodeventadminPeriodRequireTopic 
 * @param orgPeriodapachePeriodfelixPeriodeventadminPeriodIgnoreTimeout 
 * @param orgPeriodapachePeriodfelixPeriodeventadminPeriodIgnoreTopic 
 */
case class OrgApacheFelixEventadminImplEventAdminProperties(orgPeriodapachePeriodfelixPeriodeventadminPeriodThreadPoolSize: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodfelixPeriodeventadminPeriodAsyncToSyncThreadRatio: Option[ConfigNodePropertyFloat],
                orgPeriodapachePeriodfelixPeriodeventadminPeriodTimeout: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodfelixPeriodeventadminPeriodRequireTopic: Option[ConfigNodePropertyBoolean],
                orgPeriodapachePeriodfelixPeriodeventadminPeriodIgnoreTimeout: Option[ConfigNodePropertyArray],
                orgPeriodapachePeriodfelixPeriodeventadminPeriodIgnoreTopic: Option[ConfigNodePropertyArray]
                )

object OrgApacheFelixEventadminImplEventAdminProperties {
    /**
     * Creates the codec for converting OrgApacheFelixEventadminImplEventAdminProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixEventadminImplEventAdminProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixEventadminImplEventAdminProperties] = deriveEncoder
}
