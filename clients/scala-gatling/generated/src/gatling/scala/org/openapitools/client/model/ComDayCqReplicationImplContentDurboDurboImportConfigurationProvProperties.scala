
package org.openapitools.client.model


case class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties (
    _preserveHierarchyNodes: Option[ConfigNodePropertyBoolean],
    _ignoreVersioning: Option[ConfigNodePropertyBoolean],
    _importAcl: Option[ConfigNodePropertyBoolean],
    _saveThreshold: Option[ConfigNodePropertyInteger],
    _preserveUserPaths: Option[ConfigNodePropertyBoolean],
    _preserveUuid: Option[ConfigNodePropertyBoolean],
    _preserveUuidNodetypes: Option[ConfigNodePropertyArray],
    _preserveUuidSubtrees: Option[ConfigNodePropertyArray],
    _autoCommit: Option[ConfigNodePropertyBoolean]
)
object ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties {
    def toStringBody(var_preserveHierarchyNodes: Object, var_ignoreVersioning: Object, var_importAcl: Object, var_saveThreshold: Object, var_preserveUserPaths: Object, var_preserveUuid: Object, var_preserveUuidNodetypes: Object, var_preserveUuidSubtrees: Object, var_autoCommit: Object) =
        s"""
        | {
        | "preserveHierarchyNodes":$var_preserveHierarchyNodes,"ignoreVersioning":$var_ignoreVersioning,"importAcl":$var_importAcl,"saveThreshold":$var_saveThreshold,"preserveUserPaths":$var_preserveUserPaths,"preserveUuid":$var_preserveUuid,"preserveUuidNodetypes":$var_preserveUuidNodetypes,"preserveUuidSubtrees":$var_preserveUuidSubtrees,"autoCommit":$var_autoCommit
        | }
        """.stripMargin
}
