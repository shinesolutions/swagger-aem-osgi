-module(openapi_com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties/0]).

-type openapi_com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_properties() ::
    #{ 'priorityOrder' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'replyEmailPatterns' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'priorityOrder' := PriorityOrder,
          'replyEmailPatterns' := ReplyEmailPatterns
        }) ->
    #{ 'priorityOrder' => PriorityOrder,
       'replyEmailPatterns' => ReplyEmailPatterns
     }.
