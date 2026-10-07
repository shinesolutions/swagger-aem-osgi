-module(openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties/0]).

-type openapi_org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_properties() ::
    #{ 'datasources' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'step' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'archives' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'path' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'datasources' := Datasources,
          'step' := Step,
          'archives' := Archives,
          'path' := Path
        }) ->
    #{ 'datasources' => Datasources,
       'step' => Step,
       'archives' => Archives,
       'path' => Path
     }.
