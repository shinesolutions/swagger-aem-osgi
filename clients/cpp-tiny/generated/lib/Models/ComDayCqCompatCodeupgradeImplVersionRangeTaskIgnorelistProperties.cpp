

#include "ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties.h"

using namespace Tiny;

ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties()
{
	effectiveBundleListPath = ConfigNodePropertyString();
}

ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::~ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties()
{

}

void
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *effectiveBundleListPathKey = "effectiveBundleListPath";

    if(object.has_key(effectiveBundleListPathKey))
    {
        bourne::json value = object[effectiveBundleListPathKey];




        ConfigNodePropertyString* obj = &effectiveBundleListPath;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["effectiveBundleListPath"] = getEffectiveBundleListPath().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::getEffectiveBundleListPath()
{
	return effectiveBundleListPath;
}

void
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties::setEffectiveBundleListPath(ConfigNodePropertyString effectiveBundleListPath)
{
	this->effectiveBundleListPath = effectiveBundleListPath;
}



