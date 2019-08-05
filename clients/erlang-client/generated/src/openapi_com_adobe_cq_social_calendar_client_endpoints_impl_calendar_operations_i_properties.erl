-module(openapi_com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i_properties/0]).

-type openapi_com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i_properties() ::
    #{ 'MaxRetry' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'fieldWhitelist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'attachmentTypeBlacklist' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'MaxRetry' := MaxRetry,
          'fieldWhitelist' := FieldWhitelist,
          'attachmentTypeBlacklist' := AttachmentTypeBlacklist
        }) ->
    #{ 'MaxRetry' => MaxRetry,
       'fieldWhitelist' => FieldWhitelist,
       'attachmentTypeBlacklist' => AttachmentTypeBlacklist
     }.
