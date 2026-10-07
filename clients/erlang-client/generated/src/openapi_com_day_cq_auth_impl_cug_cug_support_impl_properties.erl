-module(openapi_com_day_cq_auth_impl_cug_cug_support_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_auth_impl_cug_cug_support_impl_properties/0]).

-type openapi_com_day_cq_auth_impl_cug_cug_support_impl_properties() ::
    #{ 'cug_exempted_principals' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cug_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'cug_principals_regex' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cug_principals_replacement' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'cug_exempted_principals' := CugExemptedPrincipals,
          'cug_enabled' := CugEnabled,
          'cug_principals_regex' := CugPrincipalsRegex,
          'cug_principals_replacement' := CugPrincipalsReplacement
        }) ->
    #{ 'cug.exempted.principals' => CugExemptedPrincipals,
       'cug.enabled' => CugEnabled,
       'cug.principals.regex' => CugPrincipalsRegex,
       'cug.principals.replacement' => CugPrincipalsReplacement
     }.
