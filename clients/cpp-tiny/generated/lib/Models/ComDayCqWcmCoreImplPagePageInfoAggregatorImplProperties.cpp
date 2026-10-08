

#include "ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties()
{
	pageinfoproviderpropertyregexdefault = ConfigNodePropertyString();
	pageinfoproviderpropertyname = ConfigNodePropertyString();
}

ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::~ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties()
{

}

void
ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pageinfoproviderpropertyregexdefaultKey = "page.info.provider.property.regex.default";

    if(object.has_key(pageinfoproviderpropertyregexdefaultKey))
    {
        bourne::json value = object[pageinfoproviderpropertyregexdefaultKey];




        ConfigNodePropertyString* obj = &pageinfoproviderpropertyregexdefault;
		obj->fromJson(value.dump());

    }

    const char *pageinfoproviderpropertynameKey = "page.info.provider.property.name";

    if(object.has_key(pageinfoproviderpropertynameKey))
    {
        bourne::json value = object[pageinfoproviderpropertynameKey];




        ConfigNodePropertyString* obj = &pageinfoproviderpropertyname;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["pageinfoproviderpropertyregexdefault"] = getPageinfoproviderpropertyregexdefault().toJson();






	object["pageinfoproviderpropertyname"] = getPageinfoproviderpropertyname().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::getPageinfoproviderpropertyregexdefault()
{
	return pageinfoproviderpropertyregexdefault;
}

void
ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::setPageinfoproviderpropertyregexdefault(ConfigNodePropertyString pageinfoproviderpropertyregexdefault)
{
	this->pageinfoproviderpropertyregexdefault = pageinfoproviderpropertyregexdefault;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::getPageinfoproviderpropertyname()
{
	return pageinfoproviderpropertyname;
}

void
ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties::setPageinfoproviderpropertyname(ConfigNodePropertyString pageinfoproviderpropertyname)
{
	this->pageinfoproviderpropertyname = pageinfoproviderpropertyname;
}



