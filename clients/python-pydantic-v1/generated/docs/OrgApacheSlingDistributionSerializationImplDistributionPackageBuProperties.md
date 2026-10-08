# OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**type** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**format_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**temp_fs_folder** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**file_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**memory_unit** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**use_off_heap_memory** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**digest_algorithm** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**monitoring_queue_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cleanup_delay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**package_filters** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**property_filters** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties import OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties from a JSON string
org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_instance = OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.to_json()

# convert the object into a dict
org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_dict = org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_instance.to_dict()
# create an instance of OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties from a dict
org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_from_dict = OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.from_dict(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


