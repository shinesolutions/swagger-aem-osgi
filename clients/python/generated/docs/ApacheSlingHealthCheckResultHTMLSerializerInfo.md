# ApacheSlingHealthCheckResultHTMLSerializerInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**ApacheSlingHealthCheckResultHTMLSerializerProperties**](ApacheSlingHealthCheckResultHTMLSerializerProperties.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.apache_sling_health_check_result_html_serializer_info import ApacheSlingHealthCheckResultHTMLSerializerInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ApacheSlingHealthCheckResultHTMLSerializerInfo from a JSON string
apache_sling_health_check_result_html_serializer_info_instance = ApacheSlingHealthCheckResultHTMLSerializerInfo.from_json(json)
# print the JSON string representation of the object
print(ApacheSlingHealthCheckResultHTMLSerializerInfo.to_json())

# convert the object into a dict
apache_sling_health_check_result_html_serializer_info_dict = apache_sling_health_check_result_html_serializer_info_instance.to_dict()
# create an instance of ApacheSlingHealthCheckResultHTMLSerializerInfo from a dict
apache_sling_health_check_result_html_serializer_info_from_dict = ApacheSlingHealthCheckResultHTMLSerializerInfo.from_dict(apache_sling_health_check_result_html_serializer_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


