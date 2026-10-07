# OrgApacheSlingSecurityImplReferrerFilterProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_empty** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**allow_hosts** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**allow_hosts_regexp** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**filter_methods** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**exclude_agents_regexp** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_security_impl_referrer_filter_properties import OrgApacheSlingSecurityImplReferrerFilterProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingSecurityImplReferrerFilterProperties from a JSON string
org_apache_sling_security_impl_referrer_filter_properties_instance = OrgApacheSlingSecurityImplReferrerFilterProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingSecurityImplReferrerFilterProperties.to_json())

# convert the object into a dict
org_apache_sling_security_impl_referrer_filter_properties_dict = org_apache_sling_security_impl_referrer_filter_properties_instance.to_dict()
# create an instance of OrgApacheSlingSecurityImplReferrerFilterProperties from a dict
org_apache_sling_security_impl_referrer_filter_properties_from_dict = OrgApacheSlingSecurityImplReferrerFilterProperties.from_dict(org_apache_sling_security_impl_referrer_filter_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


