# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqAuditPurgeReplication
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, auditlog_rule_name: nil, auditlog_rule_contentpath: nil, auditlog_rule_minimumage: nil, auditlog_rule_types: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.audit.purge.Replication',
          type: OpenapiClient::Models::ComAdobeCqAuditPurgeReplicationInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'auditlog.rule.name' => auditlog_rule_name, 'auditlog.rule.contentpath' => auditlog_rule_contentpath, 'auditlog.rule.minimumage' => auditlog_rule_minimumage, 'auditlog.rule.types' => auditlog_rule_types }
        )
      end
    end
  end
end
