

#include "ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.h"

using namespace Tiny;

ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties::ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties()
{
	cqdamscene7configurationeventlistenerenabled = ConfigNodePropertyBoolean();
}

ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties::ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties::~ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties()
{

}

void
ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdamscene7configurationeventlistenerenabledKey = "cq.dam.scene7.configurationeventlistener.enabled";

    if(object.has_key(cqdamscene7configurationeventlistenerenabledKey))
    {
        bourne::json value = object[cqdamscene7configurationeventlistenerenabledKey];




        ConfigNodePropertyBoolean* obj = &cqdamscene7configurationeventlistenerenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdamscene7configurationeventlistenerenabled"] = getCqdamscene7configurationeventlistenerenabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties::getCqdamscene7configurationeventlistenerenabled()
{
	return cqdamscene7configurationeventlistenerenabled;
}

void
ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties::setCqdamscene7configurationeventlistenerenabled(ConfigNodePropertyBoolean cqdamscene7configurationeventlistenerenabled)
{
	this->cqdamscene7configurationeventlistenerenabled = cqdamscene7configurationeventlistenerenabled;
}



