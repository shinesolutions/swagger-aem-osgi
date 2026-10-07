-module(openapi_com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties/0]).

-type openapi_com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties() ::
    #{ 'inbox_impl_typeprovider_registrypaths' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'inbox_impl_typeprovider_legacypaths' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'inbox_impl_typeprovider_defaulturl_failureitem' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'inbox_impl_typeprovider_defaulturl_workitem' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'inbox_impl_typeprovider_defaulturl_task' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'inbox_impl_typeprovider_registrypaths' := InboxImplTypeproviderRegistrypaths,
          'inbox_impl_typeprovider_legacypaths' := InboxImplTypeproviderLegacypaths,
          'inbox_impl_typeprovider_defaulturl_failureitem' := InboxImplTypeproviderDefaulturlFailureitem,
          'inbox_impl_typeprovider_defaulturl_workitem' := InboxImplTypeproviderDefaulturlWorkitem,
          'inbox_impl_typeprovider_defaulturl_task' := InboxImplTypeproviderDefaulturlTask
        }) ->
    #{ 'inbox.impl.typeprovider.registrypaths' => InboxImplTypeproviderRegistrypaths,
       'inbox.impl.typeprovider.legacypaths' => InboxImplTypeproviderLegacypaths,
       'inbox.impl.typeprovider.defaulturl.failureitem' => InboxImplTypeproviderDefaulturlFailureitem,
       'inbox.impl.typeprovider.defaulturl.workitem' => InboxImplTypeproviderDefaulturlWorkitem,
       'inbox.impl.typeprovider.defaulturl.task' => InboxImplTypeproviderDefaulturlTask
     }.
