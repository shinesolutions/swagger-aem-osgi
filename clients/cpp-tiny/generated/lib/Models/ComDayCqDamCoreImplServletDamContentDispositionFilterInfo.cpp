

#include "ComDayCqDamCoreImplServletDamContentDispositionFilterInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplServletDamContentDispositionFilterInfo::ComDayCqDamCoreImplServletDamContentDispositionFilterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplServletDamContentDispositionFilterProperties();
}

ComDayCqDamCoreImplServletDamContentDispositionFilterInfo::ComDayCqDamCoreImplServletDamContentDispositionFilterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletDamContentDispositionFilterInfo::~ComDayCqDamCoreImplServletDamContentDispositionFilterInfo()
{

}

void
ComDayCqDamCoreImplServletDamContentDispositionFilterInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplServletDamContentDispositionFilterProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletDamContentDispositionFilterInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplServletDamContentDispositionFilterInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplServletDamContentDispositionFilterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplServletDamContentDispositionFilterInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplServletDamContentDispositionFilterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplServletDamContentDispositionFilterInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplServletDamContentDispositionFilterInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplServletDamContentDispositionFilterProperties
ComDayCqDamCoreImplServletDamContentDispositionFilterInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplServletDamContentDispositionFilterInfo::setProperties(ComDayCqDamCoreImplServletDamContentDispositionFilterProperties properties)
{
	this->properties = properties;
}



