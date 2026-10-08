

#include "ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties.h"

using namespace Tiny;

ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties::ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties()
{
	getPeriod = ConfigNodePropertyInteger();
}

ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties::ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties::~ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties()
{

}

void
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *getPeriodKey = "getPeriod";

    if(object.has_key(getPeriodKey))
    {
        bourne::json value = object[getPeriodKey];




        ConfigNodePropertyInteger* obj = &getPeriod;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["getPeriod"] = getGetPeriod().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties::getGetPeriod()
{
	return getPeriod;
}

void
ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties::setGetPeriod(ConfigNodePropertyInteger getPeriod)
{
	this->getPeriod = getPeriod;
}



