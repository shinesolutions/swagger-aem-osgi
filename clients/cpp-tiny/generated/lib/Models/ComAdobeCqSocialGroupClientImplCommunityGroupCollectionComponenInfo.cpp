

#include "ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo.h"

using namespace Tiny;

ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo::ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties();
}

ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo::ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo::~ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo()
{

}

void
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo::setProperties(ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties properties)
{
	this->properties = properties;
}



