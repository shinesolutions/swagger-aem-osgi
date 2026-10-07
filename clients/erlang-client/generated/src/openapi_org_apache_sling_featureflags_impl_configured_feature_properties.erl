-module(openapi_org_apache_sling_featureflags_impl_configured_feature_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_featureflags_impl_configured_feature_properties/0]).

-type openapi_org_apache_sling_featureflags_impl_configured_feature_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'description' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'name' := Name,
          'description' := Description,
          'enabled' := Enabled
        }) ->
    #{ 'name' => Name,
       'description' => Description,
       'enabled' => Enabled
     }.
