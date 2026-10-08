-module(openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_properties/0]).

-export([openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_properties/1]).

-export_type([openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_properties/0]).

-type openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_properties() ::
  [ {'port', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_properties() ->
    openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_properties([]).

openapi_org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_properties(Fields) ->
  Default = [ {'port', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

