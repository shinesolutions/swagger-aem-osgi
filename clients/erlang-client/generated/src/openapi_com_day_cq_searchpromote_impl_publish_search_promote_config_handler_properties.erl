-module(openapi_com_day_cq_searchpromote_impl_publish_search_promote_config_handler_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_searchpromote_impl_publish_search_promote_config_handler_properties/0]).

-type openapi_com_day_cq_searchpromote_impl_publish_search_promote_config_handler_properties() ::
    #{ 'cq_searchpromote_confighandler_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'cq_searchpromote_confighandler_enabled' := CqSearchpromoteConfighandlerEnabled
        }) ->
    #{ 'cq.searchpromote.confighandler.enabled' => CqSearchpromoteConfighandlerEnabled
     }.
