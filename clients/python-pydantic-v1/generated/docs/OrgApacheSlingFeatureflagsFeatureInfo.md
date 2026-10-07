# OrgApacheSlingFeatureflagsFeatureInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**OrgApacheSlingFeatureflagsFeatureProperties**](OrgApacheSlingFeatureflagsFeatureProperties.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_featureflags_feature_info import OrgApacheSlingFeatureflagsFeatureInfo

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingFeatureflagsFeatureInfo from a JSON string
org_apache_sling_featureflags_feature_info_instance = OrgApacheSlingFeatureflagsFeatureInfo.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingFeatureflagsFeatureInfo.to_json()

# convert the object into a dict
org_apache_sling_featureflags_feature_info_dict = org_apache_sling_featureflags_feature_info_instance.to_dict()
# create an instance of OrgApacheSlingFeatureflagsFeatureInfo from a dict
org_apache_sling_featureflags_feature_info_from_dict = OrgApacheSlingFeatureflagsFeatureInfo.from_dict(org_apache_sling_featureflags_feature_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


