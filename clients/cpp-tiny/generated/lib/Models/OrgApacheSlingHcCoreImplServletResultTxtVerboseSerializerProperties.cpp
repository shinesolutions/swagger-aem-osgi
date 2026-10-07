

#include "OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.h"

using namespace Tiny;

OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties()
{
	totalWidth = ConfigNodePropertyInteger();
	colWidthName = ConfigNodePropertyInteger();
	colWidthResult = ConfigNodePropertyInteger();
	colWidthTiming = ConfigNodePropertyInteger();
}

OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::~OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties()
{

}

void
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *totalWidthKey = "totalWidth";

    if(object.has_key(totalWidthKey))
    {
        bourne::json value = object[totalWidthKey];




        ConfigNodePropertyInteger* obj = &totalWidth;
		obj->fromJson(value.dump());

    }

    const char *colWidthNameKey = "colWidthName";

    if(object.has_key(colWidthNameKey))
    {
        bourne::json value = object[colWidthNameKey];




        ConfigNodePropertyInteger* obj = &colWidthName;
		obj->fromJson(value.dump());

    }

    const char *colWidthResultKey = "colWidthResult";

    if(object.has_key(colWidthResultKey))
    {
        bourne::json value = object[colWidthResultKey];




        ConfigNodePropertyInteger* obj = &colWidthResult;
		obj->fromJson(value.dump());

    }

    const char *colWidthTimingKey = "colWidthTiming";

    if(object.has_key(colWidthTimingKey))
    {
        bourne::json value = object[colWidthTimingKey];




        ConfigNodePropertyInteger* obj = &colWidthTiming;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["totalWidth"] = getTotalWidth().toJson();






	object["colWidthName"] = getColWidthName().toJson();






	object["colWidthResult"] = getColWidthResult().toJson();






	object["colWidthTiming"] = getColWidthTiming().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::getTotalWidth()
{
	return totalWidth;
}

void
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::setTotalWidth(ConfigNodePropertyInteger totalWidth)
{
	this->totalWidth = totalWidth;
}

ConfigNodePropertyInteger
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::getColWidthName()
{
	return colWidthName;
}

void
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::setColWidthName(ConfigNodePropertyInteger colWidthName)
{
	this->colWidthName = colWidthName;
}

ConfigNodePropertyInteger
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::getColWidthResult()
{
	return colWidthResult;
}

void
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::setColWidthResult(ConfigNodePropertyInteger colWidthResult)
{
	this->colWidthResult = colWidthResult;
}

ConfigNodePropertyInteger
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::getColWidthTiming()
{
	return colWidthTiming;
}

void
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::setColWidthTiming(ConfigNodePropertyInteger colWidthTiming)
{
	this->colWidthTiming = colWidthTiming;
}



