

#include "ComDayCqDamCoreImplDamChangeEventListenerProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplDamChangeEventListenerProperties::ComDayCqDamCoreImplDamChangeEventListenerProperties()
{
	changeeventlistenerobservedpaths = ConfigNodePropertyArray();
}

ComDayCqDamCoreImplDamChangeEventListenerProperties::ComDayCqDamCoreImplDamChangeEventListenerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplDamChangeEventListenerProperties::~ComDayCqDamCoreImplDamChangeEventListenerProperties()
{

}

void
ComDayCqDamCoreImplDamChangeEventListenerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *changeeventlistenerobservedpathsKey = "changeeventlistener.observed.paths";

    if(object.has_key(changeeventlistenerobservedpathsKey))
    {
        bourne::json value = object[changeeventlistenerobservedpathsKey];




        ConfigNodePropertyArray* obj = &changeeventlistenerobservedpaths;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplDamChangeEventListenerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["changeeventlistenerobservedpaths"] = getChangeeventlistenerobservedpaths().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqDamCoreImplDamChangeEventListenerProperties::getChangeeventlistenerobservedpaths()
{
	return changeeventlistenerobservedpaths;
}

void
ComDayCqDamCoreImplDamChangeEventListenerProperties::setChangeeventlistenerobservedpaths(ConfigNodePropertyArray changeeventlistenerobservedpaths)
{
	this->changeeventlistenerobservedpaths = changeeventlistenerobservedpaths;
}



