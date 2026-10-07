
package org.openapitools.client.model


case class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties (
    _group2memberRelationshipOutgoing: Option[ConfigNodePropertyString],
    _group2memberExcludedOutgoing: Option[ConfigNodePropertyArray],
    _group2memberRelationshipIncoming: Option[ConfigNodePropertyString],
    _group2memberExcludedIncoming: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties {
    def toStringBody(var_group2memberRelationshipOutgoing: Object, var_group2memberExcludedOutgoing: Object, var_group2memberRelationshipIncoming: Object, var_group2memberExcludedIncoming: Object) =
        s"""
        | {
        | "group2memberRelationshipOutgoing":$var_group2memberRelationshipOutgoing,"group2memberExcludedOutgoing":$var_group2memberExcludedOutgoing,"group2memberRelationshipIncoming":$var_group2memberRelationshipIncoming,"group2memberExcludedIncoming":$var_group2memberExcludedIncoming
        | }
        """.stripMargin
}
