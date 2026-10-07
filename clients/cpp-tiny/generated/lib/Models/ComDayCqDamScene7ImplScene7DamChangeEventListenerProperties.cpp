

#include "ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.h"

using namespace Tiny;

ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties()
{
	cqdamscene7damchangeeventlistenerenabled = ConfigNodePropertyBoolean();
	cqdamscene7damchangeeventlistenerobservedpaths = ConfigNodePropertyArray();
}

ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::~ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties()
{

}

void
ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdamscene7damchangeeventlistenerenabledKey = "cq.dam.scene7.damchangeeventlistener.enabled";

    if(object.has_key(cqdamscene7damchangeeventlistenerenabledKey))
    {
        bourne::json value = object[cqdamscene7damchangeeventlistenerenabledKey];




        ConfigNodePropertyBoolean* obj = &cqdamscene7damchangeeventlistenerenabled;
		obj->fromJson(value.dump());

    }

    const char *cqdamscene7damchangeeventlistenerobservedpathsKey = "cq.dam.scene7.damchangeeventlistener.observed.paths";

    if(object.has_key(cqdamscene7damchangeeventlistenerobservedpathsKey))
    {
        bourne::json value = object[cqdamscene7damchangeeventlistenerobservedpathsKey];




        ConfigNodePropertyArray* obj = &cqdamscene7damchangeeventlistenerobservedpaths;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdamscene7damchangeeventlistenerenabled"] = getCqdamscene7damchangeeventlistenerenabled().toJson();






	object["cqdamscene7damchangeeventlistenerobservedpaths"] = getCqdamscene7damchangeeventlistenerobservedpaths().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::getCqdamscene7damchangeeventlistenerenabled()
{
	return cqdamscene7damchangeeventlistenerenabled;
}

void
ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::setCqdamscene7damchangeeventlistenerenabled(ConfigNodePropertyBoolean cqdamscene7damchangeeventlistenerenabled)
{
	this->cqdamscene7damchangeeventlistenerenabled = cqdamscene7damchangeeventlistenerenabled;
}

ConfigNodePropertyArray
ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::getCqdamscene7damchangeeventlistenerobservedpaths()
{
	return cqdamscene7damchangeeventlistenerobservedpaths;
}

void
ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties::setCqdamscene7damchangeeventlistenerobservedpaths(ConfigNodePropertyArray cqdamscene7damchangeeventlistenerobservedpaths)
{
	this->cqdamscene7damchangeeventlistenerobservedpaths = cqdamscene7damchangeeventlistenerobservedpaths;
}



