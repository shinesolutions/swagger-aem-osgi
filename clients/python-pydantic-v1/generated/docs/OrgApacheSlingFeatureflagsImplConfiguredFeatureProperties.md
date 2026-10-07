# OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**description** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_featureflags_impl_configured_feature_properties import OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties from a JSON string
org_apache_sling_featureflags_impl_configured_feature_properties_instance = OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties.to_json()

# convert the object into a dict
org_apache_sling_featureflags_impl_configured_feature_properties_dict = org_apache_sling_featureflags_impl_configured_feature_properties_instance.to_dict()
# create an instance of OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties from a dict
org_apache_sling_featureflags_impl_configured_feature_properties_from_dict = OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties.from_dict(org_apache_sling_featureflags_impl_configured_feature_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


