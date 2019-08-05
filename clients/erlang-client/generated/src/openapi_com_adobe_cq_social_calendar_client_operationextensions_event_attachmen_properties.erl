-module(openapi_com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties/0]).

-type openapi_com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties() ::
    #{ 'attachmentTypeBlacklist' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'extension_order' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'attachmentTypeBlacklist' := AttachmentTypeBlacklist,
          'extension_order' := ExtensionOrder
        }) ->
    #{ 'attachmentTypeBlacklist' => AttachmentTypeBlacklist,
       'extension.order' => ExtensionOrder
     }.
