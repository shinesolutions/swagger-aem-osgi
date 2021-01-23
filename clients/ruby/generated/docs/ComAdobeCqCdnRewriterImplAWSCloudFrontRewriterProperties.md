# SwaggerAemOsgiClient::ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **service_ranking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **keypair_id** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **keypair_alias** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **cdnrewriter_attributes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **cdn_rewriter_distribution_domain** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.new(
  service_ranking: null,
  keypair_id: null,
  keypair_alias: null,
  cdnrewriter_attributes: null,
  cdn_rewriter_distribution_domain: null
)
```

