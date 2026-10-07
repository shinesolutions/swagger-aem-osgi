

#include "ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.h"

using namespace Tiny;

ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties()
{
	processlabel = ConfigNodePropertyString();
}

ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::~ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties()
{

}

void
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *processlabelKey = "process.label";

    if(object.has_key(processlabelKey))
    {
        bourne::json value = object[processlabelKey];




        ConfigNodePropertyString* obj = &processlabel;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["processlabel"] = getProcesslabel().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::getProcesslabel()
{
	return processlabel;
}

void
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties::setProcesslabel(ConfigNodePropertyString processlabel)
{
	this->processlabel = processlabel;
}



