-module(openapi_com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties/0]).

-type openapi_com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties() ::
    #{ 'minThreadPoolSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'maxThreadPoolSize' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'minThreadPoolSize' := MinThreadPoolSize,
          'maxThreadPoolSize' := MaxThreadPoolSize
        }) ->
    #{ 'minThreadPoolSize' => MinThreadPoolSize,
       'maxThreadPoolSize' => MaxThreadPoolSize
     }.
