-module(openapi_com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties/0]).

-type openapi_com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_properties() ::
    #{ 'from_address' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sender_host' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'max_bounce_count' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'from_address' := FromAddress,
          'sender_host' := SenderHost,
          'max_bounce_count' := MaxBounceCount
        }) ->
    #{ 'from.address' => FromAddress,
       'sender.host' => SenderHost,
       'max.bounce.count' => MaxBounceCount
     }.
