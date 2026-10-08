# MessagingUserComponentFactoryInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**MessagingUserComponentFactoryProperties**](MessagingUserComponentFactoryProperties.md) |  | [optional] 

## Example

```python
from openapi_client.models.messaging_user_component_factory_info import MessagingUserComponentFactoryInfo

# TODO update the JSON string below
json = "{}"
# create an instance of MessagingUserComponentFactoryInfo from a JSON string
messaging_user_component_factory_info_instance = MessagingUserComponentFactoryInfo.from_json(json)
# print the JSON string representation of the object
print MessagingUserComponentFactoryInfo.to_json()

# convert the object into a dict
messaging_user_component_factory_info_dict = messaging_user_component_factory_info_instance.to_dict()
# create an instance of MessagingUserComponentFactoryInfo from a dict
messaging_user_component_factory_info_from_dict = MessagingUserComponentFactoryInfo.from_dict(messaging_user_component_factory_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


