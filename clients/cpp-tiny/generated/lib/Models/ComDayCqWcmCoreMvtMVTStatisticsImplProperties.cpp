

#include "ComDayCqWcmCoreMvtMVTStatisticsImplProperties.h"

using namespace Tiny;

ComDayCqWcmCoreMvtMVTStatisticsImplProperties::ComDayCqWcmCoreMvtMVTStatisticsImplProperties()
{
	mvtstatisticstrackingurl = ConfigNodePropertyString();
}

ComDayCqWcmCoreMvtMVTStatisticsImplProperties::ComDayCqWcmCoreMvtMVTStatisticsImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreMvtMVTStatisticsImplProperties::~ComDayCqWcmCoreMvtMVTStatisticsImplProperties()
{

}

void
ComDayCqWcmCoreMvtMVTStatisticsImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *mvtstatisticstrackingurlKey = "mvtstatistics.trackingurl";

    if(object.has_key(mvtstatisticstrackingurlKey))
    {
        bourne::json value = object[mvtstatisticstrackingurlKey];




        ConfigNodePropertyString* obj = &mvtstatisticstrackingurl;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreMvtMVTStatisticsImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["mvtstatisticstrackingurl"] = getMvtstatisticstrackingurl().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmCoreMvtMVTStatisticsImplProperties::getMvtstatisticstrackingurl()
{
	return mvtstatisticstrackingurl;
}

void
ComDayCqWcmCoreMvtMVTStatisticsImplProperties::setMvtstatisticstrackingurl(ConfigNodePropertyString mvtstatisticstrackingurl)
{
	this->mvtstatisticstrackingurl = mvtstatisticstrackingurl;
}



