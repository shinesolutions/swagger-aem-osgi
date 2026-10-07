

#include "ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.h"

using namespace Tiny;

ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties()
{
	offloadingtransporter = ConfigNodePropertyString();
	offloadingcleanuppayload = ConfigNodePropertyBoolean();
}

ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::~ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties()
{

}

void
ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *offloadingtransporterKey = "offloading.transporter";

    if(object.has_key(offloadingtransporterKey))
    {
        bourne::json value = object[offloadingtransporterKey];




        ConfigNodePropertyString* obj = &offloadingtransporter;
		obj->fromJson(value.dump());

    }

    const char *offloadingcleanuppayloadKey = "offloading.cleanup.payload";

    if(object.has_key(offloadingcleanuppayloadKey))
    {
        bourne::json value = object[offloadingcleanuppayloadKey];




        ConfigNodePropertyBoolean* obj = &offloadingcleanuppayload;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["offloadingtransporter"] = getOffloadingtransporter().toJson();






	object["offloadingcleanuppayload"] = getOffloadingcleanuppayload().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::getOffloadingtransporter()
{
	return offloadingtransporter;
}

void
ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::setOffloadingtransporter(ConfigNodePropertyString offloadingtransporter)
{
	this->offloadingtransporter = offloadingtransporter;
}

ConfigNodePropertyBoolean
ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::getOffloadingcleanuppayload()
{
	return offloadingcleanuppayload;
}

void
ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties::setOffloadingcleanuppayload(ConfigNodePropertyBoolean offloadingcleanuppayload)
{
	this->offloadingcleanuppayload = offloadingcleanuppayload;
}



