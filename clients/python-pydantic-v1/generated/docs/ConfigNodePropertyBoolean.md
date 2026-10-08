# ConfigNodePropertyBoolean


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | property name | [optional] 
**optional** | **bool** | True if optional | [optional] 
**is_set** | **bool** | True if property is set | [optional] 
**type** | **int** | Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String) | [optional] 
**value** | **bool** | Property value | [optional] 
**description** | **str** | Property description | [optional] 

## Example

```python
from openapi_client.models.config_node_property_boolean import ConfigNodePropertyBoolean

# TODO update the JSON string below
json = "{}"
# create an instance of ConfigNodePropertyBoolean from a JSON string
config_node_property_boolean_instance = ConfigNodePropertyBoolean.from_json(json)
# print the JSON string representation of the object
print ConfigNodePropertyBoolean.to_json()

# convert the object into a dict
config_node_property_boolean_dict = config_node_property_boolean_instance.to_dict()
# create an instance of ConfigNodePropertyBoolean from a dict
config_node_property_boolean_from_dict = ConfigNodePropertyBoolean.from_dict(config_node_property_boolean_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


