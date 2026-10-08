

#include "ComDayCqWcmCoreImplEventPageEventAuditListenerProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplEventPageEventAuditListenerProperties::ComDayCqWcmCoreImplEventPageEventAuditListenerProperties()
{
	configured = ConfigNodePropertyString();
}

ComDayCqWcmCoreImplEventPageEventAuditListenerProperties::ComDayCqWcmCoreImplEventPageEventAuditListenerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplEventPageEventAuditListenerProperties::~ComDayCqWcmCoreImplEventPageEventAuditListenerProperties()
{

}

void
ComDayCqWcmCoreImplEventPageEventAuditListenerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *configuredKey = "configured";

    if(object.has_key(configuredKey))
    {
        bourne::json value = object[configuredKey];




        ConfigNodePropertyString* obj = &configured;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplEventPageEventAuditListenerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["configured"] = getConfigured().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmCoreImplEventPageEventAuditListenerProperties::getConfigured()
{
	return configured;
}

void
ComDayCqWcmCoreImplEventPageEventAuditListenerProperties::setConfigured(ConfigNodePropertyString configured)
{
	this->configured = configured;
}



