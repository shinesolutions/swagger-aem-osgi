require "json"

module OpenAPIClient
  module Api
  class ComDayCqJcrclustersupportClusterStartLevelController
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cluster_level_enable : Bool? = nil, cluster_master_level : Int32? = nil, cluster_slave_level : Int32? = nil) : Response(OpenAPIClient::ComDayCqJcrclustersupportClusterStartLevelControllerInfo)
      @conn.request(OpenAPIClient::ComDayCqJcrclustersupportClusterStartLevelControllerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.jcrclustersupport.ClusterStartLevelController",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cluster.level.enable" => cluster_level_enable, "cluster.master.level" => cluster_master_level, "cluster.slave.level" => cluster_slave_level },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
