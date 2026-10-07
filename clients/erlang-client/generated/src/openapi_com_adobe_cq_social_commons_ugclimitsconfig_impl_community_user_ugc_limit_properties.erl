-module(openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties/0]).

-type openapi_com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_properties() ::
    #{ 'enable' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'UGCLimit' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'ugcLimitDuration' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'domains' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'toList' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'enable' := Enable,
          'UGCLimit' := UGCLimit,
          'ugcLimitDuration' := UgcLimitDuration,
          'domains' := Domains,
          'toList' := ToList
        }) ->
    #{ 'enable' => Enable,
       'UGCLimit' => UGCLimit,
       'ugcLimitDuration' => UgcLimitDuration,
       'domains' => Domains,
       'toList' => ToList
     }.
