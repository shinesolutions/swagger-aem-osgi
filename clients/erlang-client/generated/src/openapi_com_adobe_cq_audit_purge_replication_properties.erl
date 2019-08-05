-module(openapi_com_adobe_cq_audit_purge_replication_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_audit_purge_replication_properties/0]).

-type openapi_com_adobe_cq_audit_purge_replication_properties() ::
    #{ 'auditlog_rule_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auditlog_rule_contentpath' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'auditlog_rule_minimumage' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'auditlog_rule_types' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down()
     }.

encode(#{ 'auditlog_rule_name' := AuditlogRuleName,
          'auditlog_rule_contentpath' := AuditlogRuleContentpath,
          'auditlog_rule_minimumage' := AuditlogRuleMinimumage,
          'auditlog_rule_types' := AuditlogRuleTypes
        }) ->
    #{ 'auditlog.rule.name' => AuditlogRuleName,
       'auditlog.rule.contentpath' => AuditlogRuleContentpath,
       'auditlog.rule.minimumage' => AuditlogRuleMinimumage,
       'auditlog.rule.types' => AuditlogRuleTypes
     }.
