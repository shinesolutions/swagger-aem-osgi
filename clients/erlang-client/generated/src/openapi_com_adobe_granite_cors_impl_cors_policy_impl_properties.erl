-module(openapi_com_adobe_granite_cors_impl_cors_policy_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_cors_impl_cors_policy_impl_properties/0]).

-type openapi_com_adobe_granite_cors_impl_cors_policy_impl_properties() ::
    #{ 'alloworigin' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'alloworiginregexp' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'allowedpaths' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'exposedheaders' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'maxage' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'supportedheaders' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'supportedmethods' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'supportscredentials' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'alloworigin' := Alloworigin,
          'alloworiginregexp' := Alloworiginregexp,
          'allowedpaths' := Allowedpaths,
          'exposedheaders' := Exposedheaders,
          'maxage' := Maxage,
          'supportedheaders' := Supportedheaders,
          'supportedmethods' := Supportedmethods,
          'supportscredentials' := Supportscredentials
        }) ->
    #{ 'alloworigin' => Alloworigin,
       'alloworiginregexp' => Alloworiginregexp,
       'allowedpaths' => Allowedpaths,
       'exposedheaders' => Exposedheaders,
       'maxage' => Maxage,
       'supportedheaders' => Supportedheaders,
       'supportedmethods' => Supportedmethods,
       'supportscredentials' => Supportscredentials
     }.
