# ComAdobeGraniteMonitoringImplScriptConfigImplProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**script_filename** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**script_display** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**script_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**script_platform** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**jmxdomain** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_granite_monitoring_impl_script_config_impl_properties import ComAdobeGraniteMonitoringImplScriptConfigImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteMonitoringImplScriptConfigImplProperties from a JSON string
com_adobe_granite_monitoring_impl_script_config_impl_properties_instance = ComAdobeGraniteMonitoringImplScriptConfigImplProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeGraniteMonitoringImplScriptConfigImplProperties.to_json())

# convert the object into a dict
com_adobe_granite_monitoring_impl_script_config_impl_properties_dict = com_adobe_granite_monitoring_impl_script_config_impl_properties_instance.to_dict()
# create an instance of ComAdobeGraniteMonitoringImplScriptConfigImplProperties from a dict
com_adobe_granite_monitoring_impl_script_config_impl_properties_from_dict = ComAdobeGraniteMonitoringImplScriptConfigImplProperties.from_dict(com_adobe_granite_monitoring_impl_script_config_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


