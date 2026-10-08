

#include "ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo.h"

using namespace Tiny;

ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo::ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties();
}

ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo::ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo::~ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo()
{

}

void
ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo::getPid()
{
	return pid;
}

void
ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo::getTitle()
{
	return title;
}

void
ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo::getDescription()
{
	return description;
}

void
ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties
ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo::setProperties(ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties properties)
{
	this->properties = properties;
}



