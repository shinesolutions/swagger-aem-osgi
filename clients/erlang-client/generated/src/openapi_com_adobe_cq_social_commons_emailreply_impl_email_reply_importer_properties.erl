-module(openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties/0]).

-type openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties() ::
    #{ 'connectProtocol' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down()
     }.

encode(#{ 'connectProtocol' := ConnectProtocol
        }) ->
    #{ 'connectProtocol' => ConnectProtocol
     }.
