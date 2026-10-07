

#include "ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo.h"

using namespace Tiny;

ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo::ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties();
}

ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo::ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo::~ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo()
{

}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo::getPid()
{
	return pid;
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo::getTitle()
{
	return title;
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo::getDescription()
{
	return description;
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo::setProperties(ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties properties)
{
	this->properties = properties;
}



