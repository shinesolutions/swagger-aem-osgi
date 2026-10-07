# OrgApacheSlingTenantInternalTenantProviderImplProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenant_root** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**tenant_path_matcher** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_tenant_internal_tenant_provider_impl_properties import OrgApacheSlingTenantInternalTenantProviderImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingTenantInternalTenantProviderImplProperties from a JSON string
org_apache_sling_tenant_internal_tenant_provider_impl_properties_instance = OrgApacheSlingTenantInternalTenantProviderImplProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingTenantInternalTenantProviderImplProperties.to_json()

# convert the object into a dict
org_apache_sling_tenant_internal_tenant_provider_impl_properties_dict = org_apache_sling_tenant_internal_tenant_provider_impl_properties_instance.to_dict()
# create an instance of OrgApacheSlingTenantInternalTenantProviderImplProperties from a dict
org_apache_sling_tenant_internal_tenant_provider_impl_properties_from_dict = OrgApacheSlingTenantInternalTenantProviderImplProperties.from_dict(org_apache_sling_tenant_internal_tenant_provider_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


