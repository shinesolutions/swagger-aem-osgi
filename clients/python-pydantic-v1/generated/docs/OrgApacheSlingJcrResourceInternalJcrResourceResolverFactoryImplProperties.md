# OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resource_resolver_searchpath** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**resource_resolver_manglenamespaces** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**resource_resolver_allow_direct** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**resource_resolver_required_providers** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**resource_resolver_required_providernames** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**resource_resolver_virtual** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**resource_resolver_mapping** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**resource_resolver_map_location** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**resource_resolver_map_observation** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**resource_resolver_default_vanity_redirect_status** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**resource_resolver_enable_vanitypath** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**resource_resolver_vanitypath_max_entries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**resource_resolver_vanitypath_max_entries_startup** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**resource_resolver_vanitypath_bloomfilter_max_bytes** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**resource_resolver_optimize_alias_resolution** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**resource_resolver_vanitypath_whitelist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**resource_resolver_vanitypath_blacklist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**resource_resolver_vanity_precedence** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**resource_resolver_providerhandling_paranoid** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**resource_resolver_log_closing** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**resource_resolver_log_unclosed** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties import OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties from a JSON string
org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_instance = OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.to_json()

# convert the object into a dict
org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_dict = org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_instance.to_dict()
# create an instance of OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties from a dict
org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_from_dict = OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.from_dict(org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


