

#include "ComDayCqReplicationImplTransportHttpProperties.h"

using namespace Tiny;

ComDayCqReplicationImplTransportHttpProperties::ComDayCqReplicationImplTransportHttpProperties()
{
	disabledciphersuites = ConfigNodePropertyArray();
	enabledciphersuites = ConfigNodePropertyArray();
}

ComDayCqReplicationImplTransportHttpProperties::ComDayCqReplicationImplTransportHttpProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReplicationImplTransportHttpProperties::~ComDayCqReplicationImplTransportHttpProperties()
{

}

void
ComDayCqReplicationImplTransportHttpProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *disabledciphersuitesKey = "disabled.cipher.suites";

    if(object.has_key(disabledciphersuitesKey))
    {
        bourne::json value = object[disabledciphersuitesKey];




        ConfigNodePropertyArray* obj = &disabledciphersuites;
		obj->fromJson(value.dump());

    }

    const char *enabledciphersuitesKey = "enabled.cipher.suites";

    if(object.has_key(enabledciphersuitesKey))
    {
        bourne::json value = object[enabledciphersuitesKey];




        ConfigNodePropertyArray* obj = &enabledciphersuites;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReplicationImplTransportHttpProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["disabledciphersuites"] = getDisabledciphersuites().toJson();






	object["enabledciphersuites"] = getEnabledciphersuites().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqReplicationImplTransportHttpProperties::getDisabledciphersuites()
{
	return disabledciphersuites;
}

void
ComDayCqReplicationImplTransportHttpProperties::setDisabledciphersuites(ConfigNodePropertyArray disabledciphersuites)
{
	this->disabledciphersuites = disabledciphersuites;
}

ConfigNodePropertyArray
ComDayCqReplicationImplTransportHttpProperties::getEnabledciphersuites()
{
	return enabledciphersuites;
}

void
ComDayCqReplicationImplTransportHttpProperties::setEnabledciphersuites(ConfigNodePropertyArray enabledciphersuites)
{
	this->enabledciphersuites = enabledciphersuites;
}



