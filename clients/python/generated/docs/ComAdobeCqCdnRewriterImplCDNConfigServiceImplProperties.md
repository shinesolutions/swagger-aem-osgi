# ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cdn_config_distribution_domain** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**cdn_config_enable_rewriting** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**cdn_config_path_prefixes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**cdn_config_cdnttl** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cdn_config_application_protocol** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties import ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties from a JSON string
com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_instance = ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.to_json())

# convert the object into a dict
com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_dict = com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_instance.to_dict()
# create an instance of ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties from a dict
com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_from_dict = ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.from_dict(com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


