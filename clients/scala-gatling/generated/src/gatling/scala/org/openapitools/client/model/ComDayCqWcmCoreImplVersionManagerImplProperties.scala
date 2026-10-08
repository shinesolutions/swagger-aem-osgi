
package org.openapitools.client.model


case class ComDayCqWcmCoreImplVersionManagerImplProperties (
    _versionmanagerCreateVersionOnActivation: Option[ConfigNodePropertyBoolean],
    _versionmanagerPurgingEnabled: Option[ConfigNodePropertyBoolean],
    _versionmanagerPurgePaths: Option[ConfigNodePropertyArray],
    _versionmanagerIvPaths: Option[ConfigNodePropertyArray],
    _versionmanagerMaxAgeDays: Option[ConfigNodePropertyInteger],
    _versionmanagerMaxNumberVersions: Option[ConfigNodePropertyInteger],
    _versionmanagerMinNumberVersions: Option[ConfigNodePropertyInteger]
)
object ComDayCqWcmCoreImplVersionManagerImplProperties {
    def toStringBody(var_versionmanagerCreateVersionOnActivation: Object, var_versionmanagerPurgingEnabled: Object, var_versionmanagerPurgePaths: Object, var_versionmanagerIvPaths: Object, var_versionmanagerMaxAgeDays: Object, var_versionmanagerMaxNumberVersions: Object, var_versionmanagerMinNumberVersions: Object) =
        s"""
        | {
        | "versionmanagerCreateVersionOnActivation":$var_versionmanagerCreateVersionOnActivation,"versionmanagerPurgingEnabled":$var_versionmanagerPurgingEnabled,"versionmanagerPurgePaths":$var_versionmanagerPurgePaths,"versionmanagerIvPaths":$var_versionmanagerIvPaths,"versionmanagerMaxAgeDays":$var_versionmanagerMaxAgeDays,"versionmanagerMaxNumberVersions":$var_versionmanagerMaxNumberVersions,"versionmanagerMinNumberVersions":$var_versionmanagerMinNumberVersions
        | }
        """.stripMargin
}
