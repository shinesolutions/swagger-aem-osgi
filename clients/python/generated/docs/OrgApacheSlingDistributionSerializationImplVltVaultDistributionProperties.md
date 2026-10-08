# OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**type** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**import_mode** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**acl_handling** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**package_roots** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**package_filters** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**property_filters** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**temp_fs_folder** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**use_binary_references** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**auto_save_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cleanup_delay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**file_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**mega_bytes** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**use_off_heap_memory** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**digest_algorithm** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**monitoring_queue_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**paths_mapping** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**strict_import** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties import OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties from a JSON string
org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_instance = OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.to_json())

# convert the object into a dict
org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_dict = org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_instance.to_dict()
# create an instance of OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties from a dict
org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_from_dict = OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.from_dict(org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


