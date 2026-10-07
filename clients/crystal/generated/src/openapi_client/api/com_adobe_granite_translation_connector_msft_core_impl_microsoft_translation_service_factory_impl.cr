require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslationServiceFactoryImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, translation_factory : String? = nil, default_connector_label : String? = nil, default_connector_attribution : String? = nil, default_connector_workspace_id : String? = nil, default_connector_subscription_key : String? = nil, language_map_location : String? = nil, category_map_location : String? = nil, retry_attempts : Int32? = nil, timeout_count : Int32? = nil) : Response(OpenAPIClient::ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.translation.connector.msft.core.impl.MicrosoftTranslationServiceFactoryImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "translationFactory" => translation_factory, "defaultConnectorLabel" => default_connector_label, "defaultConnectorAttribution" => default_connector_attribution, "defaultConnectorWorkspaceId" => default_connector_workspace_id, "defaultConnectorSubscriptionKey" => default_connector_subscription_key, "languageMapLocation" => language_map_location, "categoryMapLocation" => category_map_location, "retryAttempts" => retry_attempts, "timeoutCount" => timeout_count },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
