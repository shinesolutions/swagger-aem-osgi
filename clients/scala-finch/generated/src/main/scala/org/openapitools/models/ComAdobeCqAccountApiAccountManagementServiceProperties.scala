package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param cqPeriodaccountmanagerPeriodtokenPeriodvalidityPeriodperiod 
 * @param cqPeriodaccountmanagerPeriodconfigPeriodrequestnewaccountPeriodmail 
 * @param cqPeriodaccountmanagerPeriodconfigPeriodrequestnewpwdPeriodmail 
 */
case class ComAdobeCqAccountApiAccountManagementServiceProperties(cqPeriodaccountmanagerPeriodtokenPeriodvalidityPeriodperiod: Option[ConfigNodePropertyInteger],
                cqPeriodaccountmanagerPeriodconfigPeriodrequestnewaccountPeriodmail: Option[ConfigNodePropertyString],
                cqPeriodaccountmanagerPeriodconfigPeriodrequestnewpwdPeriodmail: Option[ConfigNodePropertyString]
                )

object ComAdobeCqAccountApiAccountManagementServiceProperties {
    /**
     * Creates the codec for converting ComAdobeCqAccountApiAccountManagementServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqAccountApiAccountManagementServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqAccountApiAccountManagementServiceProperties] = deriveEncoder
}
