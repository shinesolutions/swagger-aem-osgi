-module(openapi_com_day_cq_mailer_impl_cq_mailing_service_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_mailer_impl_cq_mailing_service_properties/0]).

-type openapi_com_day_cq_mailer_impl_cq_mailing_service_properties() ::
    #{ 'max_recipient_count' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'max_recipient_count' := MaxRecipientCount
        }) ->
    #{ 'max.recipient.count' => MaxRecipientCount
     }.
