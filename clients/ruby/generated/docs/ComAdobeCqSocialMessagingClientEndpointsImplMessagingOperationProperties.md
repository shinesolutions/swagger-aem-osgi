# SwaggerAemOsgiClient::ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **message_properties** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **message_box_size_limit** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **message_count_limit** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **notify_failure** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **failure_message_from** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **failure_template_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **max_retries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **min_wait_between_retries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **count_update_pool_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **inbox_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **sentitems_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **support_attachments** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **support_group_messaging** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **max_total_recipients** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **batch_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **max_total_attachment_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **attachment_type_blacklist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **allowed_attachment_types** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **service_selector** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **field_whitelist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.new(
  message_properties: null,
  message_box_size_limit: null,
  message_count_limit: null,
  notify_failure: null,
  failure_message_from: null,
  failure_template_path: null,
  max_retries: null,
  min_wait_between_retries: null,
  count_update_pool_size: null,
  inbox_path: null,
  sentitems_path: null,
  support_attachments: null,
  support_group_messaging: null,
  max_total_recipients: null,
  batch_size: null,
  max_total_attachment_size: null,
  attachment_type_blacklist: null,
  allowed_attachment_types: null,
  service_selector: null,
  field_whitelist: null
)
```

