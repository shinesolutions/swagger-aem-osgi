-module(openapi_org_apache_sling_jcr_repoinit_repository_initializer_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jcr_repoinit_repository_initializer_properties/0]).

-type openapi_org_apache_sling_jcr_repoinit_repository_initializer_properties() ::
    #{ 'references' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'scripts' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'references' := References,
          'scripts' := Scripts
        }) ->
    #{ 'references' => References,
       'scripts' => Scripts
     }.