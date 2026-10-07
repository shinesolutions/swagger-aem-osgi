-module(openapi_com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties/0]).

-type openapi_com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_properties() ::
    #{ 'codeupgradetasks' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'codeupgradetaskfilters' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'codeupgradetasks' := Codeupgradetasks,
          'codeupgradetaskfilters' := Codeupgradetaskfilters
        }) ->
    #{ 'codeupgradetasks' => Codeupgradetasks,
       'codeupgradetaskfilters' => Codeupgradetaskfilters
     }.
