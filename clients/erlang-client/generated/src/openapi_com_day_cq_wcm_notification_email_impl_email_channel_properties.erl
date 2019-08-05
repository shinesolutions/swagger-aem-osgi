-module(openapi_com_day_cq_wcm_notification_email_impl_email_channel_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_notification_email_impl_email_channel_properties/0]).

-type openapi_com_day_cq_wcm_notification_email_impl_email_channel_properties() ::
    #{ 'email_from' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'email_from' := EmailFrom
        }) ->
    #{ 'email.from' => EmailFrom
     }.
