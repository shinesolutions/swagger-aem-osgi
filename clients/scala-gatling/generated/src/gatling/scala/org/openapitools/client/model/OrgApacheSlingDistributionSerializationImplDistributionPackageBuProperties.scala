
package org.openapitools.client.model


case class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties (
    _name: Option[ConfigNodePropertyString],
    _type: Option[ConfigNodePropertyDropDown],
    _formatTarget: Option[ConfigNodePropertyString],
    _tempFsFolder: Option[ConfigNodePropertyString],
    _fileThreshold: Option[ConfigNodePropertyInteger],
    _memoryUnit: Option[ConfigNodePropertyDropDown],
    _useOffHeapMemory: Option[ConfigNodePropertyBoolean],
    _digestAlgorithm: Option[ConfigNodePropertyDropDown],
    _monitoringQueueSize: Option[ConfigNodePropertyInteger],
    _cleanupDelay: Option[ConfigNodePropertyInteger],
    _packageFilters: Option[ConfigNodePropertyArray],
    _propertyFilters: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties {
    def toStringBody(var_name: Object, var_type: Object, var_formatTarget: Object, var_tempFsFolder: Object, var_fileThreshold: Object, var_memoryUnit: Object, var_useOffHeapMemory: Object, var_digestAlgorithm: Object, var_monitoringQueueSize: Object, var_cleanupDelay: Object, var_packageFilters: Object, var_propertyFilters: Object) =
        s"""
        | {
        | "name":$var_name,"type":$var_type,"formatTarget":$var_formatTarget,"tempFsFolder":$var_tempFsFolder,"fileThreshold":$var_fileThreshold,"memoryUnit":$var_memoryUnit,"useOffHeapMemory":$var_useOffHeapMemory,"digestAlgorithm":$var_digestAlgorithm,"monitoringQueueSize":$var_monitoringQueueSize,"cleanupDelay":$var_cleanupDelay,"packageFilters":$var_packageFilters,"propertyFilters":$var_propertyFilters
        | }
        """.stripMargin
}
