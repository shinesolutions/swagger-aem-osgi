

#include "ComDayCqDamInddImplServletSnippetCreationServletInfo.h"

using namespace Tiny;

ComDayCqDamInddImplServletSnippetCreationServletInfo::ComDayCqDamInddImplServletSnippetCreationServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamInddImplServletSnippetCreationServletProperties();
}

ComDayCqDamInddImplServletSnippetCreationServletInfo::ComDayCqDamInddImplServletSnippetCreationServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamInddImplServletSnippetCreationServletInfo::~ComDayCqDamInddImplServletSnippetCreationServletInfo()
{

}

void
ComDayCqDamInddImplServletSnippetCreationServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamInddImplServletSnippetCreationServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamInddImplServletSnippetCreationServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamInddImplServletSnippetCreationServletInfo::getPid()
{
	return pid;
}

void
ComDayCqDamInddImplServletSnippetCreationServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamInddImplServletSnippetCreationServletInfo::getTitle()
{
	return title;
}

void
ComDayCqDamInddImplServletSnippetCreationServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamInddImplServletSnippetCreationServletInfo::getDescription()
{
	return description;
}

void
ComDayCqDamInddImplServletSnippetCreationServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamInddImplServletSnippetCreationServletProperties
ComDayCqDamInddImplServletSnippetCreationServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamInddImplServletSnippetCreationServletInfo::setProperties(ComDayCqDamInddImplServletSnippetCreationServletProperties properties)
{
	this->properties = properties;
}



