-module(openapi_org_apache_sling_security_impl_referrer_filter_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_security_impl_referrer_filter_properties/0]).

-type openapi_org_apache_sling_security_impl_referrer_filter_properties() ::
    #{ 'allow_empty' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'allow_hosts' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'allow_hosts_regexp' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'filter_methods' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'exclude_agents_regexp' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'allow_empty' := AllowEmpty,
          'allow_hosts' := AllowHosts,
          'allow_hosts_regexp' := AllowHostsRegexp,
          'filter_methods' := FilterMethods,
          'exclude_agents_regexp' := ExcludeAgentsRegexp
        }) ->
    #{ 'allow.empty' => AllowEmpty,
       'allow.hosts' => AllowHosts,
       'allow.hosts.regexp' => AllowHostsRegexp,
       'filter.methods' => FilterMethods,
       'exclude.agents.regexp' => ExcludeAgentsRegexp
     }.
