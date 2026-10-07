

#include "ComDayCqExtwidgetServletsImageSpriteServletProperties.h"

using namespace Tiny;

ComDayCqExtwidgetServletsImageSpriteServletProperties::ComDayCqExtwidgetServletsImageSpriteServletProperties()
{
	maxWidth = ConfigNodePropertyInteger();
	maxHeight = ConfigNodePropertyInteger();
}

ComDayCqExtwidgetServletsImageSpriteServletProperties::ComDayCqExtwidgetServletsImageSpriteServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqExtwidgetServletsImageSpriteServletProperties::~ComDayCqExtwidgetServletsImageSpriteServletProperties()
{

}

void
ComDayCqExtwidgetServletsImageSpriteServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *maxWidthKey = "maxWidth";

    if(object.has_key(maxWidthKey))
    {
        bourne::json value = object[maxWidthKey];




        ConfigNodePropertyInteger* obj = &maxWidth;
		obj->fromJson(value.dump());

    }

    const char *maxHeightKey = "maxHeight";

    if(object.has_key(maxHeightKey))
    {
        bourne::json value = object[maxHeightKey];




        ConfigNodePropertyInteger* obj = &maxHeight;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqExtwidgetServletsImageSpriteServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["maxWidth"] = getMaxWidth().toJson();






	object["maxHeight"] = getMaxHeight().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqExtwidgetServletsImageSpriteServletProperties::getMaxWidth()
{
	return maxWidth;
}

void
ComDayCqExtwidgetServletsImageSpriteServletProperties::setMaxWidth(ConfigNodePropertyInteger maxWidth)
{
	this->maxWidth = maxWidth;
}

ConfigNodePropertyInteger
ComDayCqExtwidgetServletsImageSpriteServletProperties::getMaxHeight()
{
	return maxHeight;
}

void
ComDayCqExtwidgetServletsImageSpriteServletProperties::setMaxHeight(ConfigNodePropertyInteger maxHeight)
{
	this->maxHeight = maxHeight;
}



