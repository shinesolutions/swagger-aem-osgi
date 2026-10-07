require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqAuditPurgeReplication
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, auditlog_rule_name : String? = nil, auditlog_rule_contentpath : String? = nil, auditlog_rule_minimumage : Int32? = nil, auditlog_rule_types : String? = nil) : Response(OpenAPIClient::ComAdobeCqAuditPurgeReplicationInfo)
      @conn.request(OpenAPIClient::ComAdobeCqAuditPurgeReplicationInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.audit.purge.Replication",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "auditlog.rule.name" => auditlog_rule_name, "auditlog.rule.contentpath" => auditlog_rule_contentpath, "auditlog.rule.minimumage" => auditlog_rule_minimumage, "auditlog.rule.types" => auditlog_rule_types },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
