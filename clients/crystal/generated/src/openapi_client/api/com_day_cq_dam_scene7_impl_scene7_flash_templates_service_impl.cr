require "json"

module OpenAPIClient
  module Api
  class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, scene7_flash_templates_rti : String? = nil, scene7_flash_templates_rsi : String? = nil, scene7_flash_templates_rb : String? = nil, scene7_flash_templates_rurl : String? = nil, scene7_flash_template_url_format_parameter : String? = nil) : Response(OpenAPIClient::ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo)
      @conn.request(OpenAPIClient::ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7FlashTemplatesServiceImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "scene7FlashTemplates.rti" => scene7_flash_templates_rti, "scene7FlashTemplates.rsi" => scene7_flash_templates_rsi, "scene7FlashTemplates.rb" => scene7_flash_templates_rb, "scene7FlashTemplates.rurl" => scene7_flash_templates_rurl, "scene7FlashTemplate.urlFormatParameter" => scene7_flash_template_url_format_parameter },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
