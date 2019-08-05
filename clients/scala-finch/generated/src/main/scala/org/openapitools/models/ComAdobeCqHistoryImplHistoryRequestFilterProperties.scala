package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param historyPeriodrequestFilterPeriodexcludedSelectors 
 * @param historyPeriodrequestFilterPeriodexcludedExtensions 
 */
case class ComAdobeCqHistoryImplHistoryRequestFilterProperties(historyPeriodrequestFilterPeriodexcludedSelectors: Option[ConfigNodePropertyArray],
                historyPeriodrequestFilterPeriodexcludedExtensions: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqHistoryImplHistoryRequestFilterProperties {
    /**
     * Creates the codec for converting ComAdobeCqHistoryImplHistoryRequestFilterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqHistoryImplHistoryRequestFilterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqHistoryImplHistoryRequestFilterProperties] = deriveEncoder
}
