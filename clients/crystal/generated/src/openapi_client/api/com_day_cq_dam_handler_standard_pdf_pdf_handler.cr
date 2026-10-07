require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamHandlerStandardPdfPdfHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, raster_annotation : Bool? = nil) : Response(OpenAPIClient::ComDayCqDamHandlerStandardPdfPdfHandlerInfo)
      @conn.request(OpenAPIClient::ComDayCqDamHandlerStandardPdfPdfHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.handler.standard.pdf.PdfHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "raster.annotation" => raster_annotation },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
