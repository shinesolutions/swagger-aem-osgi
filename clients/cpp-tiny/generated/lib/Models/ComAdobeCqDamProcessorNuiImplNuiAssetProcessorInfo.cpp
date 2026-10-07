

#include "ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo.h"

using namespace Tiny;

ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo::ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties();
}

ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo::ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo::~ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo()
{

}

void
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo::getPid()
{
	return pid;
}

void
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo::getTitle()
{
	return title;
}

void
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo::getDescription()
{
	return description;
}

void
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo::setProperties(ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties properties)
{
	this->properties = properties;
}



