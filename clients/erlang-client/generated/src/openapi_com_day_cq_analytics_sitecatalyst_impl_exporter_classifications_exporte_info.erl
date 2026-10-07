-module(openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_info/0]).

-type openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties:openapi_com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
