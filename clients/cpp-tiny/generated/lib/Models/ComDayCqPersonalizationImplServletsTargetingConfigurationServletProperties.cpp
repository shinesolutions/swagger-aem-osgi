

#include "ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties.h"

using namespace Tiny;

ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties::ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties()
{
	forcelocation = ConfigNodePropertyBoolean();
}

ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties::ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties::~ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties()
{

}

void
ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *forcelocationKey = "forcelocation";

    if(object.has_key(forcelocationKey))
    {
        bourne::json value = object[forcelocationKey];




        ConfigNodePropertyBoolean* obj = &forcelocation;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["forcelocation"] = getForcelocation().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties::getForcelocation()
{
	return forcelocation;
}

void
ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties::setForcelocation(ConfigNodePropertyBoolean forcelocation)
{
	this->forcelocation = forcelocation;
}



