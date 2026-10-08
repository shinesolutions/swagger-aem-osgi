# ComAdobeCqAuditPurgeReplicationInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**ComAdobeCqAuditPurgeReplicationProperties**](ComAdobeCqAuditPurgeReplicationProperties.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_cq_audit_purge_replication_info import ComAdobeCqAuditPurgeReplicationInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqAuditPurgeReplicationInfo from a JSON string
com_adobe_cq_audit_purge_replication_info_instance = ComAdobeCqAuditPurgeReplicationInfo.from_json(json)
# print the JSON string representation of the object
print(ComAdobeCqAuditPurgeReplicationInfo.to_json())

# convert the object into a dict
com_adobe_cq_audit_purge_replication_info_dict = com_adobe_cq_audit_purge_replication_info_instance.to_dict()
# create an instance of ComAdobeCqAuditPurgeReplicationInfo from a dict
com_adobe_cq_audit_purge_replication_info_from_dict = ComAdobeCqAuditPurgeReplicationInfo.from_dict(com_adobe_cq_audit_purge_replication_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


