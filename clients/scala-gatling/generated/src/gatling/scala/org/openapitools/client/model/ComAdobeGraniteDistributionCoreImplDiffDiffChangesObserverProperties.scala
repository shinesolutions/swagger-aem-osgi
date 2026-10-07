
package org.openapitools.client.model


case class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties (
    _enabled: Option[ConfigNodePropertyBoolean],
    _agentName: Option[ConfigNodePropertyString],
    _diffPath: Option[ConfigNodePropertyString],
    _observedPath: Option[ConfigNodePropertyString],
    _serviceName: Option[ConfigNodePropertyString],
    _propertyNames: Option[ConfigNodePropertyString],
    _distributionDelay: Option[ConfigNodePropertyInteger],
    _serviceUserTarget: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties {
    def toStringBody(var_enabled: Object, var_agentName: Object, var_diffPath: Object, var_observedPath: Object, var_serviceName: Object, var_propertyNames: Object, var_distributionDelay: Object, var_serviceUserTarget: Object) =
        s"""
        | {
        | "enabled":$var_enabled,"agentName":$var_agentName,"diffPath":$var_diffPath,"observedPath":$var_observedPath,"serviceName":$var_serviceName,"propertyNames":$var_propertyNames,"distributionDelay":$var_distributionDelay,"serviceUserTarget":$var_serviceUserTarget
        | }
        """.stripMargin
}
