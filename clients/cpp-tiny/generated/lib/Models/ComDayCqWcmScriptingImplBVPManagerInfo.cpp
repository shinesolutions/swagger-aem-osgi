

#include "ComDayCqWcmScriptingImplBVPManagerInfo.h"

using namespace Tiny;

ComDayCqWcmScriptingImplBVPManagerInfo::ComDayCqWcmScriptingImplBVPManagerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmScriptingImplBVPManagerProperties();
}

ComDayCqWcmScriptingImplBVPManagerInfo::ComDayCqWcmScriptingImplBVPManagerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmScriptingImplBVPManagerInfo::~ComDayCqWcmScriptingImplBVPManagerInfo()
{

}

void
ComDayCqWcmScriptingImplBVPManagerInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmScriptingImplBVPManagerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmScriptingImplBVPManagerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmScriptingImplBVPManagerInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmScriptingImplBVPManagerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmScriptingImplBVPManagerInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmScriptingImplBVPManagerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmScriptingImplBVPManagerInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmScriptingImplBVPManagerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmScriptingImplBVPManagerProperties
ComDayCqWcmScriptingImplBVPManagerInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmScriptingImplBVPManagerInfo::setProperties(ComDayCqWcmScriptingImplBVPManagerProperties properties)
{
	this->properties = properties;
}



