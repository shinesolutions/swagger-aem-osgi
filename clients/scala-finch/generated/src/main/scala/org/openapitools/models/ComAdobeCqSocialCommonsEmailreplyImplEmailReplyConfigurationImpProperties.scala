package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param emailPeriodname 
 * @param emailPeriodcreatePostFromReply 
 * @param emailPeriodaddCommentIdTo 
 * @param emailPeriodsubjectMaximumLength 
 * @param emailPeriodreplyToAddress 
 * @param emailPeriodreplyToDelimiter 
 * @param emailPeriodtrackerIdPrefixInSubject 
 * @param emailPeriodtrackerIdPrefixInBody 
 * @param emailPeriodasHTML 
 * @param emailPerioddefaultUserName 
 * @param emailPeriodtemplatesPeriodrootPath 
 */
case class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties(emailPeriodname: Option[ConfigNodePropertyString],
                emailPeriodcreatePostFromReply: Option[ConfigNodePropertyBoolean],
                emailPeriodaddCommentIdTo: Option[ConfigNodePropertyDropDown],
                emailPeriodsubjectMaximumLength: Option[ConfigNodePropertyInteger],
                emailPeriodreplyToAddress: Option[ConfigNodePropertyString],
                emailPeriodreplyToDelimiter: Option[ConfigNodePropertyString],
                emailPeriodtrackerIdPrefixInSubject: Option[ConfigNodePropertyString],
                emailPeriodtrackerIdPrefixInBody: Option[ConfigNodePropertyString],
                emailPeriodasHTML: Option[ConfigNodePropertyBoolean],
                emailPerioddefaultUserName: Option[ConfigNodePropertyString],
                emailPeriodtemplatesPeriodrootPath: Option[ConfigNodePropertyString]
                )

object ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties] = deriveEncoder
}
