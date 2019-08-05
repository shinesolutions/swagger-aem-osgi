package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param cqPeriodsocialPeriodcontentPeriodfragmentsPeriodservicesPeriodenabled 
 * @param cqPeriodsocialPeriodcontentPeriodfragmentsPeriodservicesPeriodwaitTimeSeconds 
 */
case class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties(cqPeriodsocialPeriodcontentPeriodfragmentsPeriodservicesPeriodenabled: Option[ConfigNodePropertyBoolean],
                cqPeriodsocialPeriodcontentPeriodfragmentsPeriodservicesPeriodwaitTimeSeconds: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties] = deriveEncoder
}
