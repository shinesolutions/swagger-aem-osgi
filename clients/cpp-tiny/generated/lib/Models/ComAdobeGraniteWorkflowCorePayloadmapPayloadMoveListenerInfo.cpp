

#include "ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo.h"

using namespace Tiny;

ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo::ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties();
}

ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo::ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo::~ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo()
{

}

void
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo::setProperties(ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties properties)
{
	this->properties = properties;
}



