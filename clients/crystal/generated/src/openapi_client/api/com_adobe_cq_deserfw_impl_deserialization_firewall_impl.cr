require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqDeserfwImplDeserializationFirewallImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, firewall_deserialization_whitelist : Array(String)? = nil, firewall_deserialization_blacklist : Array(String)? = nil, firewall_deserialization_diagnostics : String? = nil) : Response(OpenAPIClient::ComAdobeCqDeserfwImplDeserializationFirewallImplInfo)
      @conn.request(OpenAPIClient::ComAdobeCqDeserfwImplDeserializationFirewallImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.deserfw.impl.DeserializationFirewallImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "firewall.deserialization.whitelist" => firewall_deserialization_whitelist, "firewall.deserialization.blacklist" => firewall_deserialization_blacklist, "firewall.deserialization.diagnostics" => firewall_deserialization_diagnostics },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
