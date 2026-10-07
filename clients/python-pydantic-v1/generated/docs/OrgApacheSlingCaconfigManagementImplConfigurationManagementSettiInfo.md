# OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties**](OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.md) |  | [optional] 
**bundle_location** | **str** |  | [optional] 
**service_location** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_caconfig_management_impl_configuration_management_setti_info import OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo from a JSON string
org_apache_sling_caconfig_management_impl_configuration_management_setti_info_instance = OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo.to_json()

# convert the object into a dict
org_apache_sling_caconfig_management_impl_configuration_management_setti_info_dict = org_apache_sling_caconfig_management_impl_configuration_management_setti_info_instance.to_dict()
# create an instance of OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo from a dict
org_apache_sling_caconfig_management_impl_configuration_management_setti_info_from_dict = OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo.from_dict(org_apache_sling_caconfig_management_impl_configuration_management_setti_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


