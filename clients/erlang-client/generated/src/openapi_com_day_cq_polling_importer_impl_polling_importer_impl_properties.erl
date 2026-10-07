-module(openapi_com_day_cq_polling_importer_impl_polling_importer_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_polling_importer_impl_polling_importer_impl_properties/0]).

-type openapi_com_day_cq_polling_importer_impl_polling_importer_impl_properties() ::
    #{ 'importer_min_interval' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'importer_user' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'exclude_paths' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'include_paths' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'importer_min_interval' := ImporterMinInterval,
          'importer_user' := ImporterUser,
          'exclude_paths' := ExcludePaths,
          'include_paths' := IncludePaths
        }) ->
    #{ 'importer.min.interval' => ImporterMinInterval,
       'importer.user' => ImporterUser,
       'exclude.paths' => ExcludePaths,
       'include.paths' => IncludePaths
     }.
