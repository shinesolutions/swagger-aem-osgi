require "json"

module OpenAPIClient
  module Api
  class ComAdobeCqDamWebdavImplIoSpecialFilesHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, com_day_cq_dam_core_impl_io_special_files_handler_filepatters : Array(String)? = nil) : Response(OpenAPIClient::ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo)
      @conn.request(OpenAPIClient::ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.SpecialFilesHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters" => com_day_cq_dam_core_impl_io_special_files_handler_filepatters },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
