# ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offloading_transporter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**offloading_cleanup_payload** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_granite_offloading_impl_offloading_configurator_properties import ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties from a JSON string
com_adobe_granite_offloading_impl_offloading_configurator_properties_instance = ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.to_json())

# convert the object into a dict
com_adobe_granite_offloading_impl_offloading_configurator_properties_dict = com_adobe_granite_offloading_impl_offloading_configurator_properties_instance.to_dict()
# create an instance of ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties from a dict
com_adobe_granite_offloading_impl_offloading_configurator_properties_from_dict = ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.from_dict(com_adobe_granite_offloading_impl_offloading_configurator_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


