
package org.openapitools.client.model


case class ComDayCqWcmCoreImplVersionPurgeTaskProperties (
    _versionpurgePaths: Option[ConfigNodePropertyArray],
    _versionpurgeRecursive: Option[ConfigNodePropertyBoolean],
    _versionpurgeMaxVersions: Option[ConfigNodePropertyInteger],
    _versionpurgeMinVersions: Option[ConfigNodePropertyInteger],
    _versionpurgeMaxAgeDays: Option[ConfigNodePropertyInteger]
)
object ComDayCqWcmCoreImplVersionPurgeTaskProperties {
    def toStringBody(var_versionpurgePaths: Object, var_versionpurgeRecursive: Object, var_versionpurgeMaxVersions: Object, var_versionpurgeMinVersions: Object, var_versionpurgeMaxAgeDays: Object) =
        s"""
        | {
        | "versionpurgePaths":$var_versionpurgePaths,"versionpurgeRecursive":$var_versionpurgeRecursive,"versionpurgeMaxVersions":$var_versionpurgeMaxVersions,"versionpurgeMinVersions":$var_versionpurgeMinVersions,"versionpurgeMaxAgeDays":$var_versionpurgeMaxAgeDays
        | }
        """.stripMargin
}
