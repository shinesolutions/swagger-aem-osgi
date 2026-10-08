

#include "ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo.h"

using namespace Tiny;

ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo::ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties();
}

ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo::ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo::~ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo()
{

}

void
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo::setProperties(ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties properties)
{
	this->properties = properties;
}



