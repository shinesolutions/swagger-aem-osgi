

#include "ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties.h"

using namespace Tiny;

ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties()
{
	disabledciphersuites = ConfigNodePropertyArray();
	enabledciphersuites = ConfigNodePropertyArray();
}

ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::~ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties()
{

}

void
ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::fromJson(std::string jsonObj)
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
ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["disabledciphersuites"] = getDisabledciphersuites().toJson();






	object["enabledciphersuites"] = getEnabledciphersuites().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::getDisabledciphersuites()
{
	return disabledciphersuites;
}

void
ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::setDisabledciphersuites(ConfigNodePropertyArray disabledciphersuites)
{
	this->disabledciphersuites = disabledciphersuites;
}

ConfigNodePropertyArray
ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::getEnabledciphersuites()
{
	return enabledciphersuites;
}

void
ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties::setEnabledciphersuites(ConfigNodePropertyArray enabledciphersuites)
{
	this->enabledciphersuites = enabledciphersuites;
}



