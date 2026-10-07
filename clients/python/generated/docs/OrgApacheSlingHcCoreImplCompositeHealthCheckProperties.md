# OrgApacheSlingHcCoreImplCompositeHealthCheckProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hc_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**hc_tags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**hc_mbean_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**filter_tags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**filter_combine_tags_with_or** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_hc_core_impl_composite_health_check_properties import OrgApacheSlingHcCoreImplCompositeHealthCheckProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingHcCoreImplCompositeHealthCheckProperties from a JSON string
org_apache_sling_hc_core_impl_composite_health_check_properties_instance = OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.to_json())

# convert the object into a dict
org_apache_sling_hc_core_impl_composite_health_check_properties_dict = org_apache_sling_hc_core_impl_composite_health_check_properties_instance.to_dict()
# create an instance of OrgApacheSlingHcCoreImplCompositeHealthCheckProperties from a dict
org_apache_sling_hc_core_impl_composite_health_check_properties_from_dict = OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.from_dict(org_apache_sling_hc_core_impl_composite_health_check_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


