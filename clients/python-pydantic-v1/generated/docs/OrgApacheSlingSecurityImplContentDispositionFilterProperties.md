# OrgApacheSlingSecurityImplContentDispositionFilterProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sling_content_disposition_paths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**sling_content_disposition_excluded_paths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**sling_content_disposition_all_paths** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_security_impl_content_disposition_filter_properties import OrgApacheSlingSecurityImplContentDispositionFilterProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingSecurityImplContentDispositionFilterProperties from a JSON string
org_apache_sling_security_impl_content_disposition_filter_properties_instance = OrgApacheSlingSecurityImplContentDispositionFilterProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingSecurityImplContentDispositionFilterProperties.to_json()

# convert the object into a dict
org_apache_sling_security_impl_content_disposition_filter_properties_dict = org_apache_sling_security_impl_content_disposition_filter_properties_instance.to_dict()
# create an instance of OrgApacheSlingSecurityImplContentDispositionFilterProperties from a dict
org_apache_sling_security_impl_content_disposition_filter_properties_from_dict = OrgApacheSlingSecurityImplContentDispositionFilterProperties.from_dict(org_apache_sling_security_impl_content_disposition_filter_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


