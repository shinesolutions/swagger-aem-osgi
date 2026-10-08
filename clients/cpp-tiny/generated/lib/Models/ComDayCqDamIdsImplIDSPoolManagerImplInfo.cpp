

#include "ComDayCqDamIdsImplIDSPoolManagerImplInfo.h"

using namespace Tiny;

ComDayCqDamIdsImplIDSPoolManagerImplInfo::ComDayCqDamIdsImplIDSPoolManagerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamIdsImplIDSPoolManagerImplProperties();
}

ComDayCqDamIdsImplIDSPoolManagerImplInfo::ComDayCqDamIdsImplIDSPoolManagerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamIdsImplIDSPoolManagerImplInfo::~ComDayCqDamIdsImplIDSPoolManagerImplInfo()
{

}

void
ComDayCqDamIdsImplIDSPoolManagerImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamIdsImplIDSPoolManagerImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamIdsImplIDSPoolManagerImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamIdsImplIDSPoolManagerImplInfo::getPid()
{
	return pid;
}

void
ComDayCqDamIdsImplIDSPoolManagerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamIdsImplIDSPoolManagerImplInfo::getTitle()
{
	return title;
}

void
ComDayCqDamIdsImplIDSPoolManagerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamIdsImplIDSPoolManagerImplInfo::getDescription()
{
	return description;
}

void
ComDayCqDamIdsImplIDSPoolManagerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamIdsImplIDSPoolManagerImplProperties
ComDayCqDamIdsImplIDSPoolManagerImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamIdsImplIDSPoolManagerImplInfo::setProperties(ComDayCqDamIdsImplIDSPoolManagerImplProperties properties)
{
	this->properties = properties;
}



