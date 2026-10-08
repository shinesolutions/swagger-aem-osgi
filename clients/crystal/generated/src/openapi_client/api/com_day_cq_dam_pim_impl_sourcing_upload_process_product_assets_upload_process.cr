require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProcess
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, delete_zip_file : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo)
      @conn.request(OpenAPIClient::ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.pim.impl.sourcing.upload.process.ProductAssetsUploadProcess",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "delete.zip.file" => delete_zip_file },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
