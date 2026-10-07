# OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dav_root** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**dav_create_absolute_uri** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**dav_realm** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**collection_types** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**filter_prefixes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**filter_types** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**filter_uris** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**type_collections** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**type_noncollections** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**type_content** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties import OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties from a JSON string
org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_instance = OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.to_json()

# convert the object into a dict
org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_dict = org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_instance.to_dict()
# create an instance of OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties from a dict
org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_from_dict = OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.from_dict(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


