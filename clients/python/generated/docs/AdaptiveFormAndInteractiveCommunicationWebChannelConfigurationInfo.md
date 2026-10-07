# AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties**](AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.adaptive_form_and_interactive_communication_web_channel_configuration_info import AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo

# TODO update the JSON string below
json = "{}"
# create an instance of AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo from a JSON string
adaptive_form_and_interactive_communication_web_channel_configuration_info_instance = AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo.from_json(json)
# print the JSON string representation of the object
print(AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo.to_json())

# convert the object into a dict
adaptive_form_and_interactive_communication_web_channel_configuration_info_dict = adaptive_form_and_interactive_communication_web_channel_configuration_info_instance.to_dict()
# create an instance of AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo from a dict
adaptive_form_and_interactive_communication_web_channel_configuration_info_from_dict = AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo.from_dict(adaptive_form_and_interactive_communication_web_channel_configuration_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


