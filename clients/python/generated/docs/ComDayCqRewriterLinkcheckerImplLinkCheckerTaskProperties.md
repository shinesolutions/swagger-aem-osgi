# ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduler_period** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**scheduler_concurrent** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**good_link_test_interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**bad_link_test_interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**link_unused_interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**connection_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties import ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties from a JSON string
com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_instance = ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.from_json(json)
# print the JSON string representation of the object
print(ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.to_json())

# convert the object into a dict
com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_dict = com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_instance.to_dict()
# create an instance of ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties from a dict
com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_from_dict = ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.from_dict(com_day_cq_rewriter_linkchecker_impl_link_checker_task_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


