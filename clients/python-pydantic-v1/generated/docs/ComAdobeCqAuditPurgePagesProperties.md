# ComAdobeCqAuditPurgePagesProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auditlog_rule_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**auditlog_rule_contentpath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**auditlog_rule_minimumage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**auditlog_rule_types** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_cq_audit_purge_pages_properties import ComAdobeCqAuditPurgePagesProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqAuditPurgePagesProperties from a JSON string
com_adobe_cq_audit_purge_pages_properties_instance = ComAdobeCqAuditPurgePagesProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeCqAuditPurgePagesProperties.to_json()

# convert the object into a dict
com_adobe_cq_audit_purge_pages_properties_dict = com_adobe_cq_audit_purge_pages_properties_instance.to_dict()
# create an instance of ComAdobeCqAuditPurgePagesProperties from a dict
com_adobe_cq_audit_purge_pages_properties_from_dict = ComAdobeCqAuditPurgePagesProperties.from_dict(com_adobe_cq_audit_purge_pages_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


