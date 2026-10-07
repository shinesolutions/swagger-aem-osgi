

#include "ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.h"

using namespace Tiny;

ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo::ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties();
}

ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo::ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo::~ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo()
{

}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo::setProperties(ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties properties)
{
	this->properties = properties;
}



