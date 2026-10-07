# OrgApacheSlingEngineParametersInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**OrgApacheSlingEngineParametersProperties**](OrgApacheSlingEngineParametersProperties.md) |  | [optional] 
**bundle_location** | **str** |  | [optional] 
**service_location** | **str** |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_engine_parameters_info import OrgApacheSlingEngineParametersInfo

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingEngineParametersInfo from a JSON string
org_apache_sling_engine_parameters_info_instance = OrgApacheSlingEngineParametersInfo.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingEngineParametersInfo.to_json())

# convert the object into a dict
org_apache_sling_engine_parameters_info_dict = org_apache_sling_engine_parameters_info_instance.to_dict()
# create an instance of OrgApacheSlingEngineParametersInfo from a dict
org_apache_sling_engine_parameters_info_from_dict = OrgApacheSlingEngineParametersInfo.from_dict(org_apache_sling_engine_parameters_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


