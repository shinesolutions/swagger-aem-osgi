

#include "ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties.h"

using namespace Tiny;

ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties::ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties()
{
	binarythreshold = ConfigNodePropertyInteger();
}

ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties::ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties::~ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties()
{

}

void
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *binarythresholdKey = "binary.threshold";

    if(object.has_key(binarythresholdKey))
    {
        bourne::json value = object[binarythresholdKey];




        ConfigNodePropertyInteger* obj = &binarythreshold;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["binarythreshold"] = getBinarythreshold().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties::getBinarythreshold()
{
	return binarythreshold;
}

void
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties::setBinarythreshold(ConfigNodePropertyInteger binarythreshold)
{
	this->binarythreshold = binarythreshold;
}



