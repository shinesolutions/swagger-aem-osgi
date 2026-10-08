

#include "ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.h"

using namespace Tiny;

ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties()
{
	payloadmovewhitelist = ConfigNodePropertyArray();
	payloadmovehandlefromworkflowprocess = ConfigNodePropertyBoolean();
}

ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::~ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties()
{

}

void
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *payloadmovewhitelistKey = "payload.move.white.list";

    if(object.has_key(payloadmovewhitelistKey))
    {
        bourne::json value = object[payloadmovewhitelistKey];




        ConfigNodePropertyArray* obj = &payloadmovewhitelist;
		obj->fromJson(value.dump());

    }

    const char *payloadmovehandlefromworkflowprocessKey = "payload.move.handle.from.workflow.process";

    if(object.has_key(payloadmovehandlefromworkflowprocessKey))
    {
        bourne::json value = object[payloadmovehandlefromworkflowprocessKey];




        ConfigNodePropertyBoolean* obj = &payloadmovehandlefromworkflowprocess;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["payloadmovewhitelist"] = getPayloadmovewhitelist().toJson();






	object["payloadmovehandlefromworkflowprocess"] = getPayloadmovehandlefromworkflowprocess().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::getPayloadmovewhitelist()
{
	return payloadmovewhitelist;
}

void
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::setPayloadmovewhitelist(ConfigNodePropertyArray payloadmovewhitelist)
{
	this->payloadmovewhitelist = payloadmovewhitelist;
}

ConfigNodePropertyBoolean
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::getPayloadmovehandlefromworkflowprocess()
{
	return payloadmovehandlefromworkflowprocess;
}

void
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties::setPayloadmovehandlefromworkflowprocess(ConfigNodePropertyBoolean payloadmovehandlefromworkflowprocess)
{
	this->payloadmovehandlefromworkflowprocess = payloadmovehandlefromworkflowprocess;
}



