

#include "ComDayCqDamVideoImplServletVideoTestServletProperties.h"

using namespace Tiny;

ComDayCqDamVideoImplServletVideoTestServletProperties::ComDayCqDamVideoImplServletVideoTestServletProperties()
{
	enabled = ConfigNodePropertyBoolean();
}

ComDayCqDamVideoImplServletVideoTestServletProperties::ComDayCqDamVideoImplServletVideoTestServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamVideoImplServletVideoTestServletProperties::~ComDayCqDamVideoImplServletVideoTestServletProperties()
{

}

void
ComDayCqDamVideoImplServletVideoTestServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];




        ConfigNodePropertyBoolean* obj = &enabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamVideoImplServletVideoTestServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enabled"] = getEnabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamVideoImplServletVideoTestServletProperties::getEnabled()
{
	return enabled;
}

void
ComDayCqDamVideoImplServletVideoTestServletProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}



