package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param rootPeriodpath 
 * @param fixPeriodinconsistencies 
 */
case class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties(rootPeriodpath: Option[ConfigNodePropertyString],
                fixPeriodinconsistencies: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties {
    /**
     * Creates the codec for converting ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties] = deriveEncoder
}
