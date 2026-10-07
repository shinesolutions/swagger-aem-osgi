

#include "ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo.h"

using namespace Tiny;

ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo::ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties();
}

ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo::ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo::~ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo()
{

}

void
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo::setProperties(ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties properties)
{
	this->properties = properties;
}



