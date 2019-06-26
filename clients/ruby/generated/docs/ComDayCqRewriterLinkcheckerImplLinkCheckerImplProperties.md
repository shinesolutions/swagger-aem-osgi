# SwaggerAemOsgiClient::ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduler_period** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**scheduler_concurrent** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**service_bad_link_tolerance_interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**service_check_override_patterns** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**service_cache_broken_internal_links** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**service_special_link_prefix** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**service_special_link_patterns** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Code Sample

```ruby
require 'SwaggerAemOsgiClient'

instance = SwaggerAemOsgiClient::ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.new(scheduler_period: null,
                                 scheduler_concurrent: null,
                                 service_bad_link_tolerance_interval: null,
                                 service_check_override_patterns: null,
                                 service_cache_broken_internal_links: null,
                                 service_special_link_prefix: null,
                                 service_special_link_patterns: null)
```


