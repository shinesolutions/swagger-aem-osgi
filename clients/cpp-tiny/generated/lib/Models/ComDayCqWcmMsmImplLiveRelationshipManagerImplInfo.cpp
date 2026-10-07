

#include "ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo.h"

using namespace Tiny;

ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo::ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties();
}

ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo::ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo::~ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo()
{

}

void
ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties
ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo::setProperties(ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties properties)
{
	this->properties = properties;
}



