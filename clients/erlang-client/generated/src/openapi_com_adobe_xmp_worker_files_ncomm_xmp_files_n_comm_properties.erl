-module(openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties/0]).

-type openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties() ::
    #{ 'maxConnections' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'maxRequests' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'requestTimeout' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'logDir' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'maxConnections' := MaxConnections,
          'maxRequests' := MaxRequests,
          'requestTimeout' := RequestTimeout,
          'logDir' := LogDir
        }) ->
    #{ 'maxConnections' => MaxConnections,
       'maxRequests' => MaxRequests,
       'requestTimeout' => RequestTimeout,
       'logDir' => LogDir
     }.
