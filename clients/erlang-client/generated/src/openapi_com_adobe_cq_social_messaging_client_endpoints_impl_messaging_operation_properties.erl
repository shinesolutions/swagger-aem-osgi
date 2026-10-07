-module(openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties/0]).

-type openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties() ::
    #{ 'message_properties' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'messageBoxSizeLimit' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'messageCountLimit' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'notifyFailure' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'failureMessageFrom' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'failureTemplatePath' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'maxRetries' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'minWaitBetweenRetries' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'countUpdatePoolSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'inbox_path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sentitems_path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'supportAttachments' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'supportGroupMessaging' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'maxTotalRecipients' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'batchSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'maxTotalAttachmentSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'attachmentTypeBlacklist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'allowedAttachmentTypes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'serviceSelector' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'fieldWhitelist' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'message_properties' := MessageProperties,
          'messageBoxSizeLimit' := MessageBoxSizeLimit,
          'messageCountLimit' := MessageCountLimit,
          'notifyFailure' := NotifyFailure,
          'failureMessageFrom' := FailureMessageFrom,
          'failureTemplatePath' := FailureTemplatePath,
          'maxRetries' := MaxRetries,
          'minWaitBetweenRetries' := MinWaitBetweenRetries,
          'countUpdatePoolSize' := CountUpdatePoolSize,
          'inbox_path' := InboxPath,
          'sentitems_path' := SentitemsPath,
          'supportAttachments' := SupportAttachments,
          'supportGroupMessaging' := SupportGroupMessaging,
          'maxTotalRecipients' := MaxTotalRecipients,
          'batchSize' := BatchSize,
          'maxTotalAttachmentSize' := MaxTotalAttachmentSize,
          'attachmentTypeBlacklist' := AttachmentTypeBlacklist,
          'allowedAttachmentTypes' := AllowedAttachmentTypes,
          'serviceSelector' := ServiceSelector,
          'fieldWhitelist' := FieldWhitelist
        }) ->
    #{ 'message.properties' => MessageProperties,
       'messageBoxSizeLimit' => MessageBoxSizeLimit,
       'messageCountLimit' => MessageCountLimit,
       'notifyFailure' => NotifyFailure,
       'failureMessageFrom' => FailureMessageFrom,
       'failureTemplatePath' => FailureTemplatePath,
       'maxRetries' => MaxRetries,
       'minWaitBetweenRetries' => MinWaitBetweenRetries,
       'countUpdatePoolSize' => CountUpdatePoolSize,
       'inbox.path' => InboxPath,
       'sentitems.path' => SentitemsPath,
       'supportAttachments' => SupportAttachments,
       'supportGroupMessaging' => SupportGroupMessaging,
       'maxTotalRecipients' => MaxTotalRecipients,
       'batchSize' => BatchSize,
       'maxTotalAttachmentSize' => MaxTotalAttachmentSize,
       'attachmentTypeBlacklist' => AttachmentTypeBlacklist,
       'allowedAttachmentTypes' => AllowedAttachmentTypes,
       'serviceSelector' => ServiceSelector,
       'fieldWhitelist' => FieldWhitelist
     }.
