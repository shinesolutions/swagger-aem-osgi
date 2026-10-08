# ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_project_path** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_schedule_frequency** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_ping_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_recipients** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpserver** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpport** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_usetls** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_username** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_properties import ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties from a JSON string
com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_properties_instance = ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.to_json())

# convert the object into a dict
com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_properties_dict = com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_properties_instance.to_dict()
# create an instance of ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties from a dict
com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_properties_from_dict = ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.from_dict(com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


