# ComAdobeCqScreensDeviceImplDeviceServiceInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**ComAdobeCqScreensDeviceImplDeviceServiceProperties**](ComAdobeCqScreensDeviceImplDeviceServiceProperties.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_cq_screens_device_impl_device_service_info import ComAdobeCqScreensDeviceImplDeviceServiceInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqScreensDeviceImplDeviceServiceInfo from a JSON string
com_adobe_cq_screens_device_impl_device_service_info_instance = ComAdobeCqScreensDeviceImplDeviceServiceInfo.from_json(json)
# print the JSON string representation of the object
print ComAdobeCqScreensDeviceImplDeviceServiceInfo.to_json()

# convert the object into a dict
com_adobe_cq_screens_device_impl_device_service_info_dict = com_adobe_cq_screens_device_impl_device_service_info_instance.to_dict()
# create an instance of ComAdobeCqScreensDeviceImplDeviceServiceInfo from a dict
com_adobe_cq_screens_device_impl_device_service_info_from_dict = ComAdobeCqScreensDeviceImplDeviceServiceInfo.from_dict(com_adobe_cq_screens_device_impl_device_service_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


