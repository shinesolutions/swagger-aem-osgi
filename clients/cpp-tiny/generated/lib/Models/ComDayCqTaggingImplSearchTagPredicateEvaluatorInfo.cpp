

#include "ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo.h"

using namespace Tiny;

ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo::ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties();
}

ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo::ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo::~ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo()
{

}

void
ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo::fromJson(std::string jsonObj)
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




        ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo::getPid()
{
	return pid;
}

void
ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo::getTitle()
{
	return title;
}

void
ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo::getDescription()
{
	return description;
}

void
ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties
ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo::getProperties()
{
	return properties;
}

void
ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo::setProperties(ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties properties)
{
	this->properties = properties;
}



