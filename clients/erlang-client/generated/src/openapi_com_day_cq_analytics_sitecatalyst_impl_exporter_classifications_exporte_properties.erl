-module(openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties/0]).

-type openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties() ::
    #{ 'allowed_paths' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cq_analytics_saint_exporter_pagesize' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'allowed_paths' := AllowedPaths,
          'cq_analytics_saint_exporter_pagesize' := CqAnalyticsSaintExporterPagesize
        }) ->
    #{ 'allowed.paths' => AllowedPaths,
       'cq.analytics.saint.exporter.pagesize' => CqAnalyticsSaintExporterPagesize
     }.
