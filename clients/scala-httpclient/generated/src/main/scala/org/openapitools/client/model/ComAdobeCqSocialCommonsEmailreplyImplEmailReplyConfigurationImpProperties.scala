/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model


case class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties (
  emailName: Option[ConfigNodePropertyString] = None,
  emailCreatePostFromReply: Option[ConfigNodePropertyBoolean] = None,
  emailAddCommentIdTo: Option[ConfigNodePropertyDropDown] = None,
  emailSubjectMaximumLength: Option[ConfigNodePropertyInteger] = None,
  emailReplyToAddress: Option[ConfigNodePropertyString] = None,
  emailReplyToDelimiter: Option[ConfigNodePropertyString] = None,
  emailTrackerIdPrefixInSubject: Option[ConfigNodePropertyString] = None,
  emailTrackerIdPrefixInBody: Option[ConfigNodePropertyString] = None,
  emailAsHTML: Option[ConfigNodePropertyBoolean] = None,
  emailDefaultUserName: Option[ConfigNodePropertyString] = None,
  emailTemplatesRootPath: Option[ConfigNodePropertyString] = None
)
