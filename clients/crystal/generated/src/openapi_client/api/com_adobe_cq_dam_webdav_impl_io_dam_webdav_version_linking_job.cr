require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, cq_dam_webdav_version_linking_enable : Bool? = nil, cq_dam_webdav_version_linking_scheduler_period : Int32? = nil, cq_dam_webdav_version_linking_staging_timeout : Int32? = nil) : Response(OpenAPIClient::ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo)
      @conn.request(OpenAPIClient::ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.DamWebdavVersionLinkingJob",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "cq.dam.webdav.version.linking.enable" => cq_dam_webdav_version_linking_enable, "cq.dam.webdav.version.linking.scheduler.period" => cq_dam_webdav_version_linking_scheduler_period, "cq.dam.webdav.version.linking.staging.timeout" => cq_dam_webdav_version_linking_staging_timeout },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
