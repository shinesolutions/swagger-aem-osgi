

#include "ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo.h"

using namespace Tiny;

ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo::ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties();
}

ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo::ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo::~ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo()
{

}

void
ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pidKey = "pid";

    if(object.has_key(pidKey))
    {
        bourne::json value = object[pidKey];



        jsonToValue(&pid, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *propertiesKey = "properties";

    if(object.has_key(propertiesKey))
    {
        bourne::json value = object[propertiesKey];




        ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo::getPid()
{
	return pid;
}

void
ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo::getTitle()
{
	return title;
}

void
ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo::getDescription()
{
	return description;
}

void
ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties
ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo::setProperties(ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties properties)
{
	this->properties = properties;
}



