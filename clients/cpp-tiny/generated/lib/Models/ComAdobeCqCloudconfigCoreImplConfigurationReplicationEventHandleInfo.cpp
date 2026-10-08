

#include "ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo.h"

using namespace Tiny;

ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo::ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties();
}

ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo::ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo::~ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo()
{

}

void
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo::getPid()
{
	return pid;
}

void
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo::getTitle()
{
	return title;
}

void
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo::getDescription()
{
	return description;
}

void
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo::setProperties(ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties properties)
{
	this->properties = properties;
}



