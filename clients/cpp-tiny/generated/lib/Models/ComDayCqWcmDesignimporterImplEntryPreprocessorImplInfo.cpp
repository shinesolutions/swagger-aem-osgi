

#include "ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo.h"

using namespace Tiny;

ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo::ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties();
}

ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo::ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo::~ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo()
{

}

void
ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties
ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo::setProperties(ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties properties)
{
	this->properties = properties;
}



