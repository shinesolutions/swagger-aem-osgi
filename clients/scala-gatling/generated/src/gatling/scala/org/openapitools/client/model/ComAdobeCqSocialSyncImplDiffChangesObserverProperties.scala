
package org.openapitools.client.model


case class ComAdobeCqSocialSyncImplDiffChangesObserverProperties (
    _enabled: Option[ConfigNodePropertyBoolean],
    _agentName: Option[ConfigNodePropertyString],
    _diffPath: Option[ConfigNodePropertyString],
    _propertyNames: Option[ConfigNodePropertyString]
)
object ComAdobeCqSocialSyncImplDiffChangesObserverProperties {
    def toStringBody(var_enabled: Object, var_agentName: Object, var_diffPath: Object, var_propertyNames: Object) =
        s"""
        | {
        | "enabled":$var_enabled,"agentName":$var_agentName,"diffPath":$var_diffPath,"propertyNames":$var_propertyNames
        | }
        """.stripMargin
}
