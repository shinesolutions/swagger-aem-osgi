

#include "ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo.h"

using namespace Tiny;

ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo::ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties();
}

ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo::ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo::~ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo()
{

}

void
ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo::getPid()
{
	return pid;
}

void
ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo::getTitle()
{
	return title;
}

void
ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo::getDescription()
{
	return description;
}

void
ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties
ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo::setProperties(ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties properties)
{
	this->properties = properties;
}



