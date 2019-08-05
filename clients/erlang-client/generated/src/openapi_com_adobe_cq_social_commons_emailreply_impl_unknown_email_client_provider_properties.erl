-module(openapi_com_adobe_cq_social_commons_emailreply_impl_unknown_email_client_provider_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_emailreply_impl_unknown_email_client_provider_properties/0]).

-type openapi_com_adobe_cq_social_commons_emailreply_impl_unknown_email_client_provider_properties() ::
    #{ 'replyEmailPatterns' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'priorityOrder' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'replyEmailPatterns' := ReplyEmailPatterns,
          'priorityOrder' := PriorityOrder
        }) ->
    #{ 'replyEmailPatterns' => ReplyEmailPatterns,
       'priorityOrder' => PriorityOrder
     }.
