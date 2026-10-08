-module(openapi_com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties/0]).

-export([openapi_com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties/1]).

-export_type([openapi_com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties/0]).

-type openapi_com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties() ::
  [ {'auditlogservlet_default_events_count', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'auditlogservlet_default_path', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties() ->
    openapi_com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties([]).

openapi_com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties(Fields) ->
  Default = [ {'auditlogservlet.default.events.count', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'auditlogservlet.default.path', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

