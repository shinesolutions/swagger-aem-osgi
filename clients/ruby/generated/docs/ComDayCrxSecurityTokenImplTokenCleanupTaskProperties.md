# SwaggerAemOsgiClient::ComDayCrxSecurityTokenImplTokenCleanupTaskProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enable_token_cleanup_task** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**scheduler_expression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**batch_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Code Sample

```ruby
require 'SwaggerAemOsgiClient'

instance = SwaggerAemOsgiClient::ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.new(enable_token_cleanup_task: null,
                                 scheduler_expression: null,
                                 batch_size: null)
```


