# ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_filter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**launches_eventhandler_threadpool_maxsize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**launches_eventhandler_threadpool_priority** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**launches_eventhandler_updatelastmodification** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_cq_wcm_launches_impl_launches_event_handler_properties import ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties from a JSON string
com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_instance = ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.to_json())

# convert the object into a dict
com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_dict = com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_instance.to_dict()
# create an instance of ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties from a dict
com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_from_dict = ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.from_dict(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


