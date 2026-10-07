-module(openapi_com_adobe_cq_audit_purge_pages_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_audit_purge_pages_properties/0]).

-export([openapi_com_adobe_cq_audit_purge_pages_properties/1]).

-export_type([openapi_com_adobe_cq_audit_purge_pages_properties/0]).

-type openapi_com_adobe_cq_audit_purge_pages_properties() ::
  [ {'auditlog_rule_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auditlog_rule_contentpath', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'auditlog_rule_minimumage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'auditlog_rule_types', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  ].


openapi_com_adobe_cq_audit_purge_pages_properties() ->
    openapi_com_adobe_cq_audit_purge_pages_properties([]).

openapi_com_adobe_cq_audit_purge_pages_properties(Fields) ->
  Default = [ {'auditlog.rule.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auditlog.rule.contentpath', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'auditlog.rule.minimumage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'auditlog.rule.types', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

