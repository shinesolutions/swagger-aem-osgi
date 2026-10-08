

#include "ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties.h"

using namespace Tiny;

ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties::ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties()
{
	cqdams7damdamchangeeventlistenerenabled = ConfigNodePropertyBoolean();
}

ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties::ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties::~ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties()
{

}

void
ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdams7damdamchangeeventlistenerenabledKey = "cq.dam.s7dam.damchangeeventlistener.enabled";

    if(object.has_key(cqdams7damdamchangeeventlistenerenabledKey))
    {
        bourne::json value = object[cqdams7damdamchangeeventlistenerenabledKey];




        ConfigNodePropertyBoolean* obj = &cqdams7damdamchangeeventlistenerenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdams7damdamchangeeventlistenerenabled"] = getCqdams7damdamchangeeventlistenerenabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties::getCqdams7damdamchangeeventlistenerenabled()
{
	return cqdams7damdamchangeeventlistenerenabled;
}

void
ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties::setCqdams7damdamchangeeventlistenerenabled(ConfigNodePropertyBoolean cqdams7damdamchangeeventlistenerenabled)
{
	this->cqdams7damdamchangeeventlistenerenabled = cqdams7damdamchangeeventlistenerenabled;
}



