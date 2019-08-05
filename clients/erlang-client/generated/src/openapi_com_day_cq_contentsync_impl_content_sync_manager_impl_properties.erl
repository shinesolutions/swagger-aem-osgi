-module(openapi_com_day_cq_contentsync_impl_content_sync_manager_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_contentsync_impl_content_sync_manager_impl_properties/0]).

-type openapi_com_day_cq_contentsync_impl_content_sync_manager_impl_properties() ::
    #{ 'contentsync_fallback_authorizable' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'contentsync_fallback_updateuser' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'contentsync_fallback_authorizable' := ContentsyncFallbackAuthorizable,
          'contentsync_fallback_updateuser' := ContentsyncFallbackUpdateuser
        }) ->
    #{ 'contentsync.fallback.authorizable' => ContentsyncFallbackAuthorizable,
       'contentsync.fallback.updateuser' => ContentsyncFallbackUpdateuser
     }.
