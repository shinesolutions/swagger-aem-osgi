# ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**service_ranking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**keypair_id** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**keypair_alias** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**cdnrewriter_attributes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**cdn_rewriter_distribution_domain** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties import ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties from a JSON string
com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_instance = ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.to_json())

# convert the object into a dict
com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_dict = com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_instance.to_dict()
# create an instance of ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties from a dict
com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_from_dict = ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.from_dict(com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


