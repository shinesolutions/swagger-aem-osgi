
package org.openapitools.client.model


case class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties (
    _defaultTransportAgentToWorkerPrefix: Option[ConfigNodePropertyString],
    _defaultTransportAgentToMasterPrefix: Option[ConfigNodePropertyString],
    _defaultTransportInputPackage: Option[ConfigNodePropertyString],
    _defaultTransportOutputPackage: Option[ConfigNodePropertyString],
    _defaultTransportReplicationSynchronous: Option[ConfigNodePropertyBoolean],
    _defaultTransportContentpackage: Option[ConfigNodePropertyBoolean],
    _offloadingTransporterDefaultEnabled: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties {
    def toStringBody(var_defaultTransportAgentToWorkerPrefix: Object, var_defaultTransportAgentToMasterPrefix: Object, var_defaultTransportInputPackage: Object, var_defaultTransportOutputPackage: Object, var_defaultTransportReplicationSynchronous: Object, var_defaultTransportContentpackage: Object, var_offloadingTransporterDefaultEnabled: Object) =
        s"""
        | {
        | "defaultTransportAgentToWorkerPrefix":$var_defaultTransportAgentToWorkerPrefix,"defaultTransportAgentToMasterPrefix":$var_defaultTransportAgentToMasterPrefix,"defaultTransportInputPackage":$var_defaultTransportInputPackage,"defaultTransportOutputPackage":$var_defaultTransportOutputPackage,"defaultTransportReplicationSynchronous":$var_defaultTransportReplicationSynchronous,"defaultTransportContentpackage":$var_defaultTransportContentpackage,"offloadingTransporterDefaultEnabled":$var_offloadingTransporterDefaultEnabled
        | }
        """.stripMargin
}
