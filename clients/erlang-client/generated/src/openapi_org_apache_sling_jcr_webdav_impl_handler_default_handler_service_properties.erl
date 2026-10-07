-module(openapi_org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties/0]).

-type openapi_org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties() ::
    #{ 'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'type_collections' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'type_noncollections' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'type_content' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'service_ranking' := ServiceRanking,
          'type_collections' := TypeCollections,
          'type_noncollections' := TypeNoncollections,
          'type_content' := TypeContent
        }) ->
    #{ 'service.ranking' => ServiceRanking,
       'type.collections' => TypeCollections,
       'type.noncollections' => TypeNoncollections,
       'type.content' => TypeContent
     }.
