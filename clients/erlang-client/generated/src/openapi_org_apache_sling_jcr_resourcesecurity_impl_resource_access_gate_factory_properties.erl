-module(openapi_org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties/0]).

-type openapi_org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties() ::
    #{ 'path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'checkpath_prefix' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'jcrPath' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'path' := Path,
          'checkpath_prefix' := CheckpathPrefix,
          'jcrPath' := JcrPath
        }) ->
    #{ 'path' => Path,
       'checkpath.prefix' => CheckpathPrefix,
       'jcrPath' => JcrPath
     }.
