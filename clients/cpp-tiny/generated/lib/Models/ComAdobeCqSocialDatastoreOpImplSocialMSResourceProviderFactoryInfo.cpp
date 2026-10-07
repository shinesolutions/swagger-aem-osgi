

#include "ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo.h"

using namespace Tiny;

ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo::ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties();
}

ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo::ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo::~ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo()
{

}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo::setProperties(ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties properties)
{
	this->properties = properties;
}



