package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param patternPeriodtime 
 * @param patternPeriodnewline 
 * @param patternPerioddayOfMonth 
 * @param patternPeriodmonth 
 * @param patternPeriodyear 
 * @param patternPerioddate 
 * @param patternPerioddateTime 
 * @param patternPeriodemail 
 */
case class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties(patternPeriodtime: Option[ConfigNodePropertyString],
                patternPeriodnewline: Option[ConfigNodePropertyString],
                patternPerioddayOfMonth: Option[ConfigNodePropertyString],
                patternPeriodmonth: Option[ConfigNodePropertyString],
                patternPeriodyear: Option[ConfigNodePropertyString],
                patternPerioddate: Option[ConfigNodePropertyString],
                patternPerioddateTime: Option[ConfigNodePropertyString],
                patternPeriodemail: Option[ConfigNodePropertyString]
                )

object ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties] = deriveEncoder
}
