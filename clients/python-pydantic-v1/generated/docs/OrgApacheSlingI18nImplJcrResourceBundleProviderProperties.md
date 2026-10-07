# OrgApacheSlingI18nImplJcrResourceBundleProviderProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**locale_default** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**preload_bundles** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**invalidation_delay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties import OrgApacheSlingI18nImplJcrResourceBundleProviderProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingI18nImplJcrResourceBundleProviderProperties from a JSON string
org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_instance = OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.to_json()

# convert the object into a dict
org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_dict = org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_instance.to_dict()
# create an instance of OrgApacheSlingI18nImplJcrResourceBundleProviderProperties from a dict
org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_from_dict = OrgApacheSlingI18nImplJcrResourceBundleProviderProperties.from_dict(org_apache_sling_i18n_impl_jcr_resource_bundle_provider_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


