require "json"

module OpenAPIClient
  module Api
  class ComDayCqReplicationImplReplicationReceiverImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, receiver_tmpfile_threshold : Int32? = nil, receiver_packages_use_install : Bool? = nil) : Response(OpenAPIClient::ComDayCqReplicationImplReplicationReceiverImplInfo)
      @conn.request(OpenAPIClient::ComDayCqReplicationImplReplicationReceiverImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.replication.impl.ReplicationReceiverImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "receiver.tmpfile.threshold" => receiver_tmpfile_threshold, "receiver.packages.use.install" => receiver_packages_use_install },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
