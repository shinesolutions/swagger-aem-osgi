# ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**email_create_post_from_reply** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**email_add_comment_id_to** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**email_subject_maximum_length** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**email_reply_to_address** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**email_reply_to_delimiter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**email_tracker_id_prefix_in_subject** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**email_tracker_id_prefix_in_body** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**email_as_html** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**email_default_user_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**email_templates_root_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties import ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties from a JSON string
com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_instance = ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.to_json())

# convert the object into a dict
com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_dict = com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_instance.to_dict()
# create an instance of ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties from a dict
com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_from_dict = ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.from_dict(com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


