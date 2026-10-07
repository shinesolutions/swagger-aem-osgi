# AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**show_placeholder** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**maximum_cache_entries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**af_scripting_compatversion** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**make_file_name_unique** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**generating_compliant_data** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from openapi_client.models.adaptive_form_and_interactive_communication_web_channel_configuration_properties import AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties

# TODO update the JSON string below
json = "{}"
# create an instance of AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties from a JSON string
adaptive_form_and_interactive_communication_web_channel_configuration_properties_instance = AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.from_json(json)
# print the JSON string representation of the object
print AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.to_json()

# convert the object into a dict
adaptive_form_and_interactive_communication_web_channel_configuration_properties_dict = adaptive_form_and_interactive_communication_web_channel_configuration_properties_instance.to_dict()
# create an instance of AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties from a dict
adaptive_form_and_interactive_communication_web_channel_configuration_properties_from_dict = AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.from_dict(adaptive_form_and_interactive_communication_web_channel_configuration_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


