

#include "OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo.h"

using namespace Tiny;

OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo::OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties();
}

OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo::OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo::~OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo()
{

}

void
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo::setProperties(OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties properties)
{
	this->properties = properties;
}



