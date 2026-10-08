

#include "ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo::ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties();
}

ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo::ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo::~ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo()
{

}

void
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo::setProperties(ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties properties)
{
	this->properties = properties;
}



