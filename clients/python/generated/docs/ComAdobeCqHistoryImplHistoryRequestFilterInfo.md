# ComAdobeCqHistoryImplHistoryRequestFilterInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**ComAdobeCqHistoryImplHistoryRequestFilterProperties**](ComAdobeCqHistoryImplHistoryRequestFilterProperties.md) |  | [optional] 
**bundle_location** | **str** |  | [optional] 
**service_location** | **str** |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_cq_history_impl_history_request_filter_info import ComAdobeCqHistoryImplHistoryRequestFilterInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqHistoryImplHistoryRequestFilterInfo from a JSON string
com_adobe_cq_history_impl_history_request_filter_info_instance = ComAdobeCqHistoryImplHistoryRequestFilterInfo.from_json(json)
# print the JSON string representation of the object
print(ComAdobeCqHistoryImplHistoryRequestFilterInfo.to_json())

# convert the object into a dict
com_adobe_cq_history_impl_history_request_filter_info_dict = com_adobe_cq_history_impl_history_request_filter_info_instance.to_dict()
# create an instance of ComAdobeCqHistoryImplHistoryRequestFilterInfo from a dict
com_adobe_cq_history_impl_history_request_filter_info_from_dict = ComAdobeCqHistoryImplHistoryRequestFilterInfo.from_dict(com_adobe_cq_history_impl_history_request_filter_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


