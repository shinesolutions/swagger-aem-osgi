package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param cqPeriodaclsetupPeriodrules 
 */
case class ComDayCqSecurityACLSetupProperties(cqPeriodaclsetupPeriodrules: Option[ConfigNodePropertyArray]
                )

object ComDayCqSecurityACLSetupProperties {
    /**
     * Creates the codec for converting ComDayCqSecurityACLSetupProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqSecurityACLSetupProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqSecurityACLSetupProperties] = deriveEncoder
}
