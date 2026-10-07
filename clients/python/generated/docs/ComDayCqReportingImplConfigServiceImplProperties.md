# ComDayCqReportingImplConfigServiceImplProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**repconf_timezone** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**repconf_locale** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**repconf_snapshots** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**repconf_repdir** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**repconf_hourofday** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**repconf_minofhour** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**repconf_maxrows** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**repconf_fakedata** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**repconf_snapshotuser** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**repconf_enforcesnapshotuser** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_day_cq_reporting_impl_config_service_impl_properties import ComDayCqReportingImplConfigServiceImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqReportingImplConfigServiceImplProperties from a JSON string
com_day_cq_reporting_impl_config_service_impl_properties_instance = ComDayCqReportingImplConfigServiceImplProperties.from_json(json)
# print the JSON string representation of the object
print(ComDayCqReportingImplConfigServiceImplProperties.to_json())

# convert the object into a dict
com_day_cq_reporting_impl_config_service_impl_properties_dict = com_day_cq_reporting_impl_config_service_impl_properties_instance.to_dict()
# create an instance of ComDayCqReportingImplConfigServiceImplProperties from a dict
com_day_cq_reporting_impl_config_service_impl_properties_from_dict = ComDayCqReportingImplConfigServiceImplProperties.from_dict(com_day_cq_reporting_impl_config_service_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


