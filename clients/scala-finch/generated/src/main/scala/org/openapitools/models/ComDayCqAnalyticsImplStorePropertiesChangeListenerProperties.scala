package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param cqPeriodstorePeriodlistenerPeriodadditionalStorePaths 
 */
case class ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties(cqPeriodstorePeriodlistenerPeriodadditionalStorePaths: Option[ConfigNodePropertyArray]
                )

object ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties {
    /**
     * Creates the codec for converting ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties] = deriveEncoder
}
