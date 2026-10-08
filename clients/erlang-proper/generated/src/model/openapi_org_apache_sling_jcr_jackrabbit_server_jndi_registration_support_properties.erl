-module(openapi_org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties/0]).

-export([openapi_org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties/1]).

-export_type([openapi_org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties/0]).

-type openapi_org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties() ::
  [ {'java_naming_factory_initial', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'java_naming_provider_url', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties() ->
    openapi_org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties([]).

openapi_org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_properties(Fields) ->
  Default = [ {'java.naming.factory.initial', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'java.naming.provider.url', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

