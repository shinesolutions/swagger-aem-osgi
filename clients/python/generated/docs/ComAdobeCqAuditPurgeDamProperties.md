# ComAdobeCqAuditPurgeDamProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auditlog_rule_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**auditlog_rule_contentpath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**auditlog_rule_minimumage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**auditlog_rule_types** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_cq_audit_purge_dam_properties import ComAdobeCqAuditPurgeDamProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqAuditPurgeDamProperties from a JSON string
com_adobe_cq_audit_purge_dam_properties_instance = ComAdobeCqAuditPurgeDamProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeCqAuditPurgeDamProperties.to_json())

# convert the object into a dict
com_adobe_cq_audit_purge_dam_properties_dict = com_adobe_cq_audit_purge_dam_properties_instance.to_dict()
# create an instance of ComAdobeCqAuditPurgeDamProperties from a dict
com_adobe_cq_audit_purge_dam_properties_from_dict = ComAdobeCqAuditPurgeDamProperties.from_dict(com_adobe_cq_audit_purge_dam_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


