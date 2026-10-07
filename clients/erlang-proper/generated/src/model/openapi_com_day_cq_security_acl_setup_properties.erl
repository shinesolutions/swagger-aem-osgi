-module(openapi_com_day_cq_security_acl_setup_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_security_acl_setup_properties/0]).

-export([openapi_com_day_cq_security_acl_setup_properties/1]).

-export_type([openapi_com_day_cq_security_acl_setup_properties/0]).

-type openapi_com_day_cq_security_acl_setup_properties() ::
  [ {'cq_aclsetup_rules', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_security_acl_setup_properties() ->
    openapi_com_day_cq_security_acl_setup_properties([]).

openapi_com_day_cq_security_acl_setup_properties(Fields) ->
  Default = [ {'cq.aclsetup.rules', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

