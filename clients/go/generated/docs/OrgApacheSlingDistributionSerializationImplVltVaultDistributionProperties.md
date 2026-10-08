# OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Type** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**ImportMode** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AclHandling** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PackageRoots** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PackageFilters** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**PropertyFilters** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**TempFsFolder** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**UseBinaryReferences** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**AutoSaveThreshold** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CleanupDelay** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**FileThreshold** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MEGA_BYTES** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**UseOffHeapMemory** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DigestAlgorithm** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**MonitoringQueueSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PathsMapping** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**StrictImport** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Methods

### NewOrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties

`func NewOrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties() *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties`

NewOrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties instantiates a new OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesWithDefaults

`func NewOrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesWithDefaults() *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties`

NewOrgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesWithDefaults instantiates a new OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetName() ConfigNodePropertyString`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetNameOk() (*ConfigNodePropertyString, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) SetName(v ConfigNodePropertyString)`

SetName sets Name field to given value.

### HasName

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) HasName() bool`

HasName returns a boolean if a field has been set.

### GetType

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetType() ConfigNodePropertyDropDown`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetTypeOk() (*ConfigNodePropertyDropDown, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) SetType(v ConfigNodePropertyDropDown)`

SetType sets Type field to given value.

### HasType

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) HasType() bool`

HasType returns a boolean if a field has been set.

### GetImportMode

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetImportMode() ConfigNodePropertyString`

GetImportMode returns the ImportMode field if non-nil, zero value otherwise.

### GetImportModeOk

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetImportModeOk() (*ConfigNodePropertyString, bool)`

GetImportModeOk returns a tuple with the ImportMode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImportMode

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) SetImportMode(v ConfigNodePropertyString)`

SetImportMode sets ImportMode field to given value.

### HasImportMode

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) HasImportMode() bool`

HasImportMode returns a boolean if a field has been set.

### GetAclHandling

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetAclHandling() ConfigNodePropertyString`

GetAclHandling returns the AclHandling field if non-nil, zero value otherwise.

### GetAclHandlingOk

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetAclHandlingOk() (*ConfigNodePropertyString, bool)`

GetAclHandlingOk returns a tuple with the AclHandling field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAclHandling

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) SetAclHandling(v ConfigNodePropertyString)`

SetAclHandling sets AclHandling field to given value.

### HasAclHandling

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) HasAclHandling() bool`

HasAclHandling returns a boolean if a field has been set.

### GetPackageRoots

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetPackageRoots() ConfigNodePropertyString`

GetPackageRoots returns the PackageRoots field if non-nil, zero value otherwise.

### GetPackageRootsOk

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetPackageRootsOk() (*ConfigNodePropertyString, bool)`

GetPackageRootsOk returns a tuple with the PackageRoots field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPackageRoots

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) SetPackageRoots(v ConfigNodePropertyString)`

SetPackageRoots sets PackageRoots field to given value.

### HasPackageRoots

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) HasPackageRoots() bool`

HasPackageRoots returns a boolean if a field has been set.

### GetPackageFilters

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetPackageFilters() ConfigNodePropertyArray`

GetPackageFilters returns the PackageFilters field if non-nil, zero value otherwise.

### GetPackageFiltersOk

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetPackageFiltersOk() (*ConfigNodePropertyArray, bool)`

GetPackageFiltersOk returns a tuple with the PackageFilters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPackageFilters

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) SetPackageFilters(v ConfigNodePropertyArray)`

SetPackageFilters sets PackageFilters field to given value.

### HasPackageFilters

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) HasPackageFilters() bool`

HasPackageFilters returns a boolean if a field has been set.

### GetPropertyFilters

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetPropertyFilters() ConfigNodePropertyArray`

GetPropertyFilters returns the PropertyFilters field if non-nil, zero value otherwise.

### GetPropertyFiltersOk

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetPropertyFiltersOk() (*ConfigNodePropertyArray, bool)`

GetPropertyFiltersOk returns a tuple with the PropertyFilters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPropertyFilters

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) SetPropertyFilters(v ConfigNodePropertyArray)`

SetPropertyFilters sets PropertyFilters field to given value.

### HasPropertyFilters

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) HasPropertyFilters() bool`

HasPropertyFilters returns a boolean if a field has been set.

### GetTempFsFolder

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetTempFsFolder() ConfigNodePropertyString`

GetTempFsFolder returns the TempFsFolder field if non-nil, zero value otherwise.

### GetTempFsFolderOk

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetTempFsFolderOk() (*ConfigNodePropertyString, bool)`

GetTempFsFolderOk returns a tuple with the TempFsFolder field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTempFsFolder

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) SetTempFsFolder(v ConfigNodePropertyString)`

SetTempFsFolder sets TempFsFolder field to given value.

### HasTempFsFolder

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) HasTempFsFolder() bool`

HasTempFsFolder returns a boolean if a field has been set.

### GetUseBinaryReferences

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetUseBinaryReferences() ConfigNodePropertyBoolean`

GetUseBinaryReferences returns the UseBinaryReferences field if non-nil, zero value otherwise.

### GetUseBinaryReferencesOk

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetUseBinaryReferencesOk() (*ConfigNodePropertyBoolean, bool)`

GetUseBinaryReferencesOk returns a tuple with the UseBinaryReferences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseBinaryReferences

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) SetUseBinaryReferences(v ConfigNodePropertyBoolean)`

SetUseBinaryReferences sets UseBinaryReferences field to given value.

### HasUseBinaryReferences

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) HasUseBinaryReferences() bool`

HasUseBinaryReferences returns a boolean if a field has been set.

### GetAutoSaveThreshold

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetAutoSaveThreshold() ConfigNodePropertyInteger`

GetAutoSaveThreshold returns the AutoSaveThreshold field if non-nil, zero value otherwise.

### GetAutoSaveThresholdOk

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetAutoSaveThresholdOk() (*ConfigNodePropertyInteger, bool)`

GetAutoSaveThresholdOk returns a tuple with the AutoSaveThreshold field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoSaveThreshold

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) SetAutoSaveThreshold(v ConfigNodePropertyInteger)`

SetAutoSaveThreshold sets AutoSaveThreshold field to given value.

### HasAutoSaveThreshold

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) HasAutoSaveThreshold() bool`

HasAutoSaveThreshold returns a boolean if a field has been set.

### GetCleanupDelay

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetCleanupDelay() ConfigNodePropertyInteger`

GetCleanupDelay returns the CleanupDelay field if non-nil, zero value otherwise.

### GetCleanupDelayOk

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetCleanupDelayOk() (*ConfigNodePropertyInteger, bool)`

GetCleanupDelayOk returns a tuple with the CleanupDelay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCleanupDelay

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) SetCleanupDelay(v ConfigNodePropertyInteger)`

SetCleanupDelay sets CleanupDelay field to given value.

### HasCleanupDelay

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) HasCleanupDelay() bool`

HasCleanupDelay returns a boolean if a field has been set.

### GetFileThreshold

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetFileThreshold() ConfigNodePropertyInteger`

GetFileThreshold returns the FileThreshold field if non-nil, zero value otherwise.

### GetFileThresholdOk

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetFileThresholdOk() (*ConfigNodePropertyInteger, bool)`

GetFileThresholdOk returns a tuple with the FileThreshold field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFileThreshold

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) SetFileThreshold(v ConfigNodePropertyInteger)`

SetFileThreshold sets FileThreshold field to given value.

### HasFileThreshold

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) HasFileThreshold() bool`

HasFileThreshold returns a boolean if a field has been set.

### GetMEGA_BYTES

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetMEGA_BYTES() ConfigNodePropertyDropDown`

GetMEGA_BYTES returns the MEGA_BYTES field if non-nil, zero value otherwise.

### GetMEGA_BYTESOk

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetMEGA_BYTESOk() (*ConfigNodePropertyDropDown, bool)`

GetMEGA_BYTESOk returns a tuple with the MEGA_BYTES field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMEGA_BYTES

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) SetMEGA_BYTES(v ConfigNodePropertyDropDown)`

SetMEGA_BYTES sets MEGA_BYTES field to given value.

### HasMEGA_BYTES

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) HasMEGA_BYTES() bool`

HasMEGA_BYTES returns a boolean if a field has been set.

### GetUseOffHeapMemory

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetUseOffHeapMemory() ConfigNodePropertyBoolean`

GetUseOffHeapMemory returns the UseOffHeapMemory field if non-nil, zero value otherwise.

### GetUseOffHeapMemoryOk

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetUseOffHeapMemoryOk() (*ConfigNodePropertyBoolean, bool)`

GetUseOffHeapMemoryOk returns a tuple with the UseOffHeapMemory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseOffHeapMemory

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) SetUseOffHeapMemory(v ConfigNodePropertyBoolean)`

SetUseOffHeapMemory sets UseOffHeapMemory field to given value.

### HasUseOffHeapMemory

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) HasUseOffHeapMemory() bool`

HasUseOffHeapMemory returns a boolean if a field has been set.

### GetDigestAlgorithm

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetDigestAlgorithm() ConfigNodePropertyDropDown`

GetDigestAlgorithm returns the DigestAlgorithm field if non-nil, zero value otherwise.

### GetDigestAlgorithmOk

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetDigestAlgorithmOk() (*ConfigNodePropertyDropDown, bool)`

GetDigestAlgorithmOk returns a tuple with the DigestAlgorithm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDigestAlgorithm

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) SetDigestAlgorithm(v ConfigNodePropertyDropDown)`

SetDigestAlgorithm sets DigestAlgorithm field to given value.

### HasDigestAlgorithm

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) HasDigestAlgorithm() bool`

HasDigestAlgorithm returns a boolean if a field has been set.

### GetMonitoringQueueSize

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetMonitoringQueueSize() ConfigNodePropertyInteger`

GetMonitoringQueueSize returns the MonitoringQueueSize field if non-nil, zero value otherwise.

### GetMonitoringQueueSizeOk

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetMonitoringQueueSizeOk() (*ConfigNodePropertyInteger, bool)`

GetMonitoringQueueSizeOk returns a tuple with the MonitoringQueueSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMonitoringQueueSize

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) SetMonitoringQueueSize(v ConfigNodePropertyInteger)`

SetMonitoringQueueSize sets MonitoringQueueSize field to given value.

### HasMonitoringQueueSize

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) HasMonitoringQueueSize() bool`

HasMonitoringQueueSize returns a boolean if a field has been set.

### GetPathsMapping

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetPathsMapping() ConfigNodePropertyArray`

GetPathsMapping returns the PathsMapping field if non-nil, zero value otherwise.

### GetPathsMappingOk

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetPathsMappingOk() (*ConfigNodePropertyArray, bool)`

GetPathsMappingOk returns a tuple with the PathsMapping field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPathsMapping

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) SetPathsMapping(v ConfigNodePropertyArray)`

SetPathsMapping sets PathsMapping field to given value.

### HasPathsMapping

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) HasPathsMapping() bool`

HasPathsMapping returns a boolean if a field has been set.

### GetStrictImport

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetStrictImport() ConfigNodePropertyBoolean`

GetStrictImport returns the StrictImport field if non-nil, zero value otherwise.

### GetStrictImportOk

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) GetStrictImportOk() (*ConfigNodePropertyBoolean, bool)`

GetStrictImportOk returns a tuple with the StrictImport field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStrictImport

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) SetStrictImport(v ConfigNodePropertyBoolean)`

SetStrictImport sets StrictImport field to given value.

### HasStrictImport

`func (o *OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties) HasStrictImport() bool`

HasStrictImport returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


