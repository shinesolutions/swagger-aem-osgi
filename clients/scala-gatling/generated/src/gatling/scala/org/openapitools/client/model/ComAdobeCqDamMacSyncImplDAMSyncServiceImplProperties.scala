
package org.openapitools.client.model


case class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties (
    _comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths: Option[ConfigNodePropertyArray],
    _comAdobeCqDamMacSyncDamsyncserviceSyncRenditions: Option[ConfigNodePropertyBoolean],
    _comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs: Option[ConfigNodePropertyInteger],
    _comAdobeCqDamMacSyncDamsyncservicePlatform: Option[ConfigNodePropertyDropDown]
)
object ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties {
    def toStringBody(var_comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths: Object, var_comAdobeCqDamMacSyncDamsyncserviceSyncRenditions: Object, var_comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs: Object, var_comAdobeCqDamMacSyncDamsyncservicePlatform: Object) =
        s"""
        | {
        | "comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths":$var_comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths,"comAdobeCqDamMacSyncDamsyncserviceSyncRenditions":$var_comAdobeCqDamMacSyncDamsyncserviceSyncRenditions,"comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs":$var_comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs,"comAdobeCqDamMacSyncDamsyncservicePlatform":$var_comAdobeCqDamMacSyncDamsyncservicePlatform
        | }
        """.stripMargin
}
