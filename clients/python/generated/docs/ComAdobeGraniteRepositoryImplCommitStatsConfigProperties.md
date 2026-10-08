# ComAdobeGraniteRepositoryImplCommitStatsConfigProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**interval_seconds** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**commits_per_interval_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**max_location_length** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**max_details_shown** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**min_details_percentage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**thread_matchers** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**max_greedy_depth** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**greedy_stack_matchers** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**stack_filters** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**stack_matchers** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**stack_categorizers** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**stack_shorteners** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_granite_repository_impl_commit_stats_config_properties import ComAdobeGraniteRepositoryImplCommitStatsConfigProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteRepositoryImplCommitStatsConfigProperties from a JSON string
com_adobe_granite_repository_impl_commit_stats_config_properties_instance = ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.to_json())

# convert the object into a dict
com_adobe_granite_repository_impl_commit_stats_config_properties_dict = com_adobe_granite_repository_impl_commit_stats_config_properties_instance.to_dict()
# create an instance of ComAdobeGraniteRepositoryImplCommitStatsConfigProperties from a dict
com_adobe_granite_repository_impl_commit_stats_config_properties_from_dict = ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.from_dict(com_adobe_granite_repository_impl_commit_stats_config_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


