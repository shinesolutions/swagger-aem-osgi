# OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**config_ref_resource_names** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**config_ref_property_names** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**service_ranking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy_properties import OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties from a JSON string
org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy_properties_instance = OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.to_json()

# convert the object into a dict
org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy_properties_dict = org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy_properties_instance.to_dict()
# create an instance of OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties from a dict
org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy_properties_from_dict = OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.from_dict(org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


