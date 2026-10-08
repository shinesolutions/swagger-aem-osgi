require "json"

module OpenAPIClient
  module Api
  class ComDayCqReplicationImplReplicationContentFactoryProviderImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, replication_content_use_file_storage : Bool? = nil, replication_content_max_commit_attempts : Int32? = nil) : Response(OpenAPIClient::ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo)
      @conn.request(OpenAPIClient::ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.replication.impl.ReplicationContentFactoryProviderImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "replication.content.useFileStorage" => replication_content_use_file_storage, "replication.content.maxCommitAttempts" => replication_content_max_commit_attempts },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
