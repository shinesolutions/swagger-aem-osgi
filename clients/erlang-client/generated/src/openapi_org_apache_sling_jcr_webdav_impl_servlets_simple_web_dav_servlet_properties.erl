-module(openapi_org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties/0]).

-type openapi_org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties() ::
    #{ 'dav_root' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'dav_create_absolute_uri' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'dav_realm' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'collection_types' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'filter_prefixes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'filter_types' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'filter_uris' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'type_collections' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'type_noncollections' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'type_content' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'dav_root' := DavRoot,
          'dav_create_absolute_uri' := DavCreateAbsoluteUri,
          'dav_realm' := DavRealm,
          'collection_types' := CollectionTypes,
          'filter_prefixes' := FilterPrefixes,
          'filter_types' := FilterTypes,
          'filter_uris' := FilterUris,
          'type_collections' := TypeCollections,
          'type_noncollections' := TypeNoncollections,
          'type_content' := TypeContent
        }) ->
    #{ 'dav.root' => DavRoot,
       'dav.create-absolute-uri' => DavCreateAbsoluteUri,
       'dav.realm' => DavRealm,
       'collection.types' => CollectionTypes,
       'filter.prefixes' => FilterPrefixes,
       'filter.types' => FilterTypes,
       'filter.uris' => FilterUris,
       'type.collections' => TypeCollections,
       'type.noncollections' => TypeNoncollections,
       'type.content' => TypeContent
     }.
