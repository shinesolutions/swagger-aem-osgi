-module(openapi_org_apache_sling_hapi_impl_h_api_util_impl_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_hapi_impl_h_api_util_impl_properties/0]).

-type openapi_org_apache_sling_hapi_impl_h_api_util_impl_properties() ::
    #{ 'org_apache_sling_hapi_tools_resourcetype' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'org_apache_sling_hapi_tools_collectionresourcetype' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'org_apache_sling_hapi_tools_searchpaths' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'org_apache_sling_hapi_tools_externalurl' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'org_apache_sling_hapi_tools_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'org_apache_sling_hapi_tools_resourcetype' := OrgApacheSlingHapiToolsResourcetype,
          'org_apache_sling_hapi_tools_collectionresourcetype' := OrgApacheSlingHapiToolsCollectionresourcetype,
          'org_apache_sling_hapi_tools_searchpaths' := OrgApacheSlingHapiToolsSearchpaths,
          'org_apache_sling_hapi_tools_externalurl' := OrgApacheSlingHapiToolsExternalurl,
          'org_apache_sling_hapi_tools_enabled' := OrgApacheSlingHapiToolsEnabled
        }) ->
    #{ 'org.apache.sling.hapi.tools.resourcetype' => OrgApacheSlingHapiToolsResourcetype,
       'org.apache.sling.hapi.tools.collectionresourcetype' => OrgApacheSlingHapiToolsCollectionresourcetype,
       'org.apache.sling.hapi.tools.searchpaths' => OrgApacheSlingHapiToolsSearchpaths,
       'org.apache.sling.hapi.tools.externalurl' => OrgApacheSlingHapiToolsExternalurl,
       'org.apache.sling.hapi.tools.enabled' => OrgApacheSlingHapiToolsEnabled
     }.
