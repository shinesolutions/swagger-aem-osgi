-module(openapi_com_adobe_fd_fp_config_forms_portal_scheduler_service_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_fd_fp_config_forms_portal_scheduler_service_properties/0]).

-type openapi_com_adobe_fd_fp_config_forms_portal_scheduler_service_properties() ::
    #{ 'formportal_interval' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'formportal_interval' := FormportalInterval
        }) ->
    #{ 'formportal.interval' => FormportalInterval
     }.
