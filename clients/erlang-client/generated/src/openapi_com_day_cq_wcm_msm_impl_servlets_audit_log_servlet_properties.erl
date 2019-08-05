-module(openapi_com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties/0]).

-type openapi_com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties() ::
    #{ 'auditlogservlet_default_events_count' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'auditlogservlet_default_path' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'auditlogservlet_default_events_count' := AuditlogservletDefaultEventsCount,
          'auditlogservlet_default_path' := AuditlogservletDefaultPath
        }) ->
    #{ 'auditlogservlet.default.events.count' => AuditlogservletDefaultEventsCount,
       'auditlogservlet.default.path' => AuditlogservletDefaultPath
     }.
