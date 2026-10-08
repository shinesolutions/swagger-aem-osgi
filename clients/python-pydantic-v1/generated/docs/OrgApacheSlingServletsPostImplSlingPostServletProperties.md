# OrgApacheSlingServletsPostImplSlingPostServletProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**servlet_post_date_formats** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**servlet_post_node_name_hints** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**servlet_post_node_name_max_length** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**servlet_post_checkin_new_versionable_nodes** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**servlet_post_auto_checkout** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**servlet_post_auto_checkin** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**servlet_post_ignore_pattern** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_servlets_post_impl_sling_post_servlet_properties import OrgApacheSlingServletsPostImplSlingPostServletProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingServletsPostImplSlingPostServletProperties from a JSON string
org_apache_sling_servlets_post_impl_sling_post_servlet_properties_instance = OrgApacheSlingServletsPostImplSlingPostServletProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingServletsPostImplSlingPostServletProperties.to_json()

# convert the object into a dict
org_apache_sling_servlets_post_impl_sling_post_servlet_properties_dict = org_apache_sling_servlets_post_impl_sling_post_servlet_properties_instance.to_dict()
# create an instance of OrgApacheSlingServletsPostImplSlingPostServletProperties from a dict
org_apache_sling_servlets_post_impl_sling_post_servlet_properties_from_dict = OrgApacheSlingServletsPostImplSlingPostServletProperties.from_dict(org_apache_sling_servlets_post_impl_sling_post_servlet_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


