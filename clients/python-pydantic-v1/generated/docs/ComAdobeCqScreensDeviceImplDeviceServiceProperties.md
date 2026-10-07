# ComAdobeCqScreensDeviceImplDeviceServiceProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**com_adobe_aem_screens_player_pingfrequency** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**com_adobe_aem_screens_device_pasword_specialchars** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**com_adobe_aem_screens_device_pasword_minlowercasechars** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**com_adobe_aem_screens_device_pasword_minuppercasechars** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**com_adobe_aem_screens_device_pasword_minnumberchars** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**com_adobe_aem_screens_device_pasword_minspecialchars** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**com_adobe_aem_screens_device_pasword_minlength** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_cq_screens_device_impl_device_service_properties import ComAdobeCqScreensDeviceImplDeviceServiceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqScreensDeviceImplDeviceServiceProperties from a JSON string
com_adobe_cq_screens_device_impl_device_service_properties_instance = ComAdobeCqScreensDeviceImplDeviceServiceProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeCqScreensDeviceImplDeviceServiceProperties.to_json()

# convert the object into a dict
com_adobe_cq_screens_device_impl_device_service_properties_dict = com_adobe_cq_screens_device_impl_device_service_properties_instance.to_dict()
# create an instance of ComAdobeCqScreensDeviceImplDeviceServiceProperties from a dict
com_adobe_cq_screens_device_impl_device_service_properties_from_dict = ComAdobeCqScreensDeviceImplDeviceServiceProperties.from_dict(com_adobe_cq_screens_device_impl_device_service_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


