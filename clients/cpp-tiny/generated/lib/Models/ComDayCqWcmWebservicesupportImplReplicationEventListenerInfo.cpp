

#include "ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo.h"

using namespace Tiny;

ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo::ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties();
}

ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo::ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo::~ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo()
{

}

void
ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties
ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo::setProperties(ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties properties)
{
	this->properties = properties;
}



