

#include "ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo.h"

using namespace Tiny;

ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo::ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties();
}

ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo::ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo::~ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo()
{

}

void
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo::setProperties(ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties properties)
{
	this->properties = properties;
}



