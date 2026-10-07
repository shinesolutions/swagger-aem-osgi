

#include "ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo.h"

using namespace Tiny;

ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo::ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties();
}

ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo::ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo::~ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo()
{

}

void
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo::fromJson(std::string jsonObj)
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




        ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo::getPid()
{
	return pid;
}

void
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo::getTitle()
{
	return title;
}

void
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo::getDescription()
{
	return description;
}

void
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo::getProperties()
{
	return properties;
}

void
ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo::setProperties(ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties properties)
{
	this->properties = properties;
}



