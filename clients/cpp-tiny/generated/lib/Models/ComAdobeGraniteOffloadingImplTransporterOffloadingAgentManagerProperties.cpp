

#include "ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties.h"

using namespace Tiny;

ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties::ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties()
{
	offloadingagentmanagerenabled = ConfigNodePropertyBoolean();
}

ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties::ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties::~ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties()
{

}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offloadingagentmanagerenabledKey = "offloading.agentmanager.enabled";

    if(object.has_key(offloadingagentmanagerenabledKey))
    {
        bourne::json value = object[offloadingagentmanagerenabledKey];




        ConfigNodePropertyBoolean* obj = &offloadingagentmanagerenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["offloadingagentmanagerenabled"] = getOffloadingagentmanagerenabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties::getOffloadingagentmanagerenabled()
{
	return offloadingagentmanagerenabled;
}

void
ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties::setOffloadingagentmanagerenabled(ConfigNodePropertyBoolean offloadingagentmanagerenabled)
{
	this->offloadingagentmanagerenabled = offloadingagentmanagerenabled;
}



