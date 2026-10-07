# ConfigNodePropertyDropDown


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | property name | [optional] 
**optional** | **bool** | True if optional | [optional] 
**is_set** | **bool** | True if property is set | [optional] 
**type** | [**ConfigNodePropertyDropDownType**](ConfigNodePropertyDropDownType.md) |  | [optional] 
**value** | **object** | Property value | [optional] 
**description** | **str** | Property description | [optional] 

## Example

```python
from swaggeraemosgi.models.config_node_property_drop_down import ConfigNodePropertyDropDown

# TODO update the JSON string below
json = "{}"
# create an instance of ConfigNodePropertyDropDown from a JSON string
config_node_property_drop_down_instance = ConfigNodePropertyDropDown.from_json(json)
# print the JSON string representation of the object
print(ConfigNodePropertyDropDown.to_json())

# convert the object into a dict
config_node_property_drop_down_dict = config_node_property_drop_down_instance.to_dict()
# create an instance of ConfigNodePropertyDropDown from a dict
config_node_property_drop_down_from_dict = ConfigNodePropertyDropDown.from_dict(config_node_property_drop_down_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


