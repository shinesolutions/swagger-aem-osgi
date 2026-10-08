package org.openapitools.server.model


/**
 * @param group2memberRelationshipOutgoing  for example: ''null''
 * @param group2memberExcludedOutgoing  for example: ''null''
 * @param group2memberRelationshipIncoming  for example: ''null''
 * @param group2memberExcludedIncoming  for example: ''null''
*/
final case class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties (
  group2memberRelationshipOutgoing: Option[ConfigNodePropertyString] = None,
  group2memberExcludedOutgoing: Option[ConfigNodePropertyArray] = None,
  group2memberRelationshipIncoming: Option[ConfigNodePropertyString] = None,
  group2memberExcludedIncoming: Option[ConfigNodePropertyArray] = None
)

