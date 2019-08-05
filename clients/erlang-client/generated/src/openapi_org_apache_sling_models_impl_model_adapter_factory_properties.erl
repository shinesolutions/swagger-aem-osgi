-module(openapi_org_apache_sling_models_impl_model_adapter_factory_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_models_impl_model_adapter_factory_properties/0]).

-type openapi_org_apache_sling_models_impl_model_adapter_factory_properties() ::
    #{ 'osgi_http_whiteboard_listener' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'osgi_http_whiteboard_context_select' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'max_recursion_depth' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cleanup_job_period' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'osgi_http_whiteboard_listener' := OsgiHttpWhiteboardListener,
          'osgi_http_whiteboard_context_select' := OsgiHttpWhiteboardContextSelect,
          'max_recursion_depth' := MaxRecursionDepth,
          'cleanup_job_period' := CleanupJobPeriod
        }) ->
    #{ 'osgi.http.whiteboard.listener' => OsgiHttpWhiteboardListener,
       'osgi.http.whiteboard.context.select' => OsgiHttpWhiteboardContextSelect,
       'max.recursion.depth' => MaxRecursionDepth,
       'cleanup.job.period' => CleanupJobPeriod
     }.
