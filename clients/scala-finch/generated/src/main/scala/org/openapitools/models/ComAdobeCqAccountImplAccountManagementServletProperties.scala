package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param cqPeriodaccountmanagerPeriodconfigPeriodinformnewaccountPeriodmail 
 * @param cqPeriodaccountmanagerPeriodconfigPeriodinformnewpwdPeriodmail 
 */
case class ComAdobeCqAccountImplAccountManagementServletProperties(cqPeriodaccountmanagerPeriodconfigPeriodinformnewaccountPeriodmail: Option[ConfigNodePropertyString],
                cqPeriodaccountmanagerPeriodconfigPeriodinformnewpwdPeriodmail: Option[ConfigNodePropertyString]
                )

object ComAdobeCqAccountImplAccountManagementServletProperties {
    /**
     * Creates the codec for converting ComAdobeCqAccountImplAccountManagementServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqAccountImplAccountManagementServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqAccountImplAccountManagementServletProperties] = deriveEncoder
}
