# ComAdobeCqAuditPurgePagesInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**ComAdobeCqAuditPurgePagesProperties**](ComAdobeCqAuditPurgePagesProperties.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_cq_audit_purge_pages_info import ComAdobeCqAuditPurgePagesInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqAuditPurgePagesInfo from a JSON string
com_adobe_cq_audit_purge_pages_info_instance = ComAdobeCqAuditPurgePagesInfo.from_json(json)
# print the JSON string representation of the object
print ComAdobeCqAuditPurgePagesInfo.to_json()

# convert the object into a dict
com_adobe_cq_audit_purge_pages_info_dict = com_adobe_cq_audit_purge_pages_info_instance.to_dict()
# create an instance of ComAdobeCqAuditPurgePagesInfo from a dict
com_adobe_cq_audit_purge_pages_info_from_dict = ComAdobeCqAuditPurgePagesInfo.from_dict(com_adobe_cq_audit_purge_pages_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


