# ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**watchwords_positive** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**watchwords_negative** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**watchwords_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**sentiment_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties import ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties from a JSON string
com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_instance = ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.to_json()

# convert the object into a dict
com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_dict = com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_instance.to_dict()
# create an instance of ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties from a dict
com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_from_dict = ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.from_dict(com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


