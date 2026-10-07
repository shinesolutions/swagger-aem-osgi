# OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hc_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**hc_tags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**hc_mbean_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**mbean_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**attribute_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**attribute_value_constraint** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_hc_core_impl_jmx_attribute_health_check_properties import OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties from a JSON string
org_apache_sling_hc_core_impl_jmx_attribute_health_check_properties_instance = OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.to_json()

# convert the object into a dict
org_apache_sling_hc_core_impl_jmx_attribute_health_check_properties_dict = org_apache_sling_hc_core_impl_jmx_attribute_health_check_properties_instance.to_dict()
# create an instance of OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties from a dict
org_apache_sling_hc_core_impl_jmx_attribute_health_check_properties_from_dict = OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.from_dict(org_apache_sling_hc_core_impl_jmx_attribute_health_check_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


