

#include "ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo.h"

using namespace Tiny;

ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo::ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties();
}

ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo::ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo::~ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo()
{

}

void
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo::setProperties(ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties properties)
{
	this->properties = properties;
}



