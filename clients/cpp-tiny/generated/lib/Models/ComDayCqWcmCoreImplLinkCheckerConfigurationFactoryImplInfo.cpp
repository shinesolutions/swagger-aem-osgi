

#include "ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo.h"

using namespace Tiny;

ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo::ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties();
}

ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo::ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo::~ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo()
{

}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo::setProperties(ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties properties)
{
	this->properties = properties;
}



