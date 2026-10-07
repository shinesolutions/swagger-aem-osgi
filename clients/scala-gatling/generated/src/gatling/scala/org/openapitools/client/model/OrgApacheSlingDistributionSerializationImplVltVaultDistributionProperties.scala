
package org.openapitools.client.model


case class OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties (
    _name: Option[ConfigNodePropertyString],
    _type: Option[ConfigNodePropertyDropDown],
    _importMode: Option[ConfigNodePropertyString],
    _aclHandling: Option[ConfigNodePropertyString],
    _packageRoots: Option[ConfigNodePropertyString],
    _packageFilters: Option[ConfigNodePropertyArray],
    _propertyFilters: Option[ConfigNodePropertyArray],
    _tempFsFolder: Option[ConfigNodePropertyString],
    _useBinaryReferences: Option[ConfigNodePropertyBoolean],
    _autoSaveThreshold: Option[ConfigNodePropertyInteger],
    _cleanupDelay: Option[ConfigNodePropertyInteger],
    _fileThreshold: Option[ConfigNodePropertyInteger],
    _MEGA_BYTES: Option[ConfigNodePropertyDropDown],
    _useOffHeapMemory: Option[ConfigNodePropertyBoolean],
    _digestAlgorithm: Option[ConfigNodePropertyDropDown],
    _monitoringQueueSize: Option[ConfigNodePropertyInteger],
    _pathsMapping: Option[ConfigNodePropertyArray],
    _strictImport: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties {
    def toStringBody(var_name: Object, var_type: Object, var_importMode: Object, var_aclHandling: Object, var_packageRoots: Object, var_packageFilters: Object, var_propertyFilters: Object, var_tempFsFolder: Object, var_useBinaryReferences: Object, var_autoSaveThreshold: Object, var_cleanupDelay: Object, var_fileThreshold: Object, var_MEGA_BYTES: Object, var_useOffHeapMemory: Object, var_digestAlgorithm: Object, var_monitoringQueueSize: Object, var_pathsMapping: Object, var_strictImport: Object) =
        s"""
        | {
        | "name":$var_name,"type":$var_type,"importMode":$var_importMode,"aclHandling":$var_aclHandling,"packageRoots":$var_packageRoots,"packageFilters":$var_packageFilters,"propertyFilters":$var_propertyFilters,"tempFsFolder":$var_tempFsFolder,"useBinaryReferences":$var_useBinaryReferences,"autoSaveThreshold":$var_autoSaveThreshold,"cleanupDelay":$var_cleanupDelay,"fileThreshold":$var_fileThreshold,"MEGA_BYTES":$var_MEGA_BYTES,"useOffHeapMemory":$var_useOffHeapMemory,"digestAlgorithm":$var_digestAlgorithm,"monitoringQueueSize":$var_monitoringQueueSize,"pathsMapping":$var_pathsMapping,"strictImport":$var_strictImport
        | }
        """.stripMargin
}
