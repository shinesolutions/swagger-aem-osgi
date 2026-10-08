

#include "ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo.h"

using namespace Tiny;

ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo::ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties();
}

ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo::ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo::~ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo()
{

}

void
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo::fromJson(std::string jsonObj)
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




        ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo::getPid()
{
	return pid;
}

void
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo::getTitle()
{
	return title;
}

void
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo::getDescription()
{
	return description;
}

void
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo::getProperties()
{
	return properties;
}

void
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo::setProperties(ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties properties)
{
	this->properties = properties;
}



