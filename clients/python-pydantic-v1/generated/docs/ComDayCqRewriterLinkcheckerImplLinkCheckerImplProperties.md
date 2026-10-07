# ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduler_period** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**scheduler_concurrent** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**service_bad_link_tolerance_interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**service_check_override_patterns** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**service_cache_broken_internal_links** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**service_special_link_prefix** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**service_special_link_patterns** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties import ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties from a JSON string
com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_instance = ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.from_json(json)
# print the JSON string representation of the object
print ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.to_json()

# convert the object into a dict
com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_dict = com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_instance.to_dict()
# create an instance of ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties from a dict
com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_from_dict = ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.from_dict(com_day_cq_rewriter_linkchecker_impl_link_checker_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


