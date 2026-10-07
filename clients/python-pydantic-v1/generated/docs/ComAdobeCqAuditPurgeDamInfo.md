# ComAdobeCqAuditPurgeDamInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**ComAdobeCqAuditPurgeDamProperties**](ComAdobeCqAuditPurgeDamProperties.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_cq_audit_purge_dam_info import ComAdobeCqAuditPurgeDamInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqAuditPurgeDamInfo from a JSON string
com_adobe_cq_audit_purge_dam_info_instance = ComAdobeCqAuditPurgeDamInfo.from_json(json)
# print the JSON string representation of the object
print ComAdobeCqAuditPurgeDamInfo.to_json()

# convert the object into a dict
com_adobe_cq_audit_purge_dam_info_dict = com_adobe_cq_audit_purge_dam_info_instance.to_dict()
# create an instance of ComAdobeCqAuditPurgeDamInfo from a dict
com_adobe_cq_audit_purge_dam_info_from_dict = ComAdobeCqAuditPurgeDamInfo.from_dict(com_adobe_cq_audit_purge_dam_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


