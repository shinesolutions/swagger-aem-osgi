

#include "ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo.h"

using namespace Tiny;

ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo::ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties();
}

ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo::ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo::~ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo()
{

}

void
ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties
ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo::setProperties(ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties properties)
{
	this->properties = properties;
}



