# ComAdobeCqDamS7imagingImplIsImageServerComponentProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tcp_port** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**allow_remote_access** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**max_render_rgn_pixels** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**max_message_size** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**random_access_url_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**worker_threads** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties import ComAdobeCqDamS7imagingImplIsImageServerComponentProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqDamS7imagingImplIsImageServerComponentProperties from a JSON string
com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_instance = ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.to_json()

# convert the object into a dict
com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_dict = com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_instance.to_dict()
# create an instance of ComAdobeCqDamS7imagingImplIsImageServerComponentProperties from a dict
com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_from_dict = ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.from_dict(com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


