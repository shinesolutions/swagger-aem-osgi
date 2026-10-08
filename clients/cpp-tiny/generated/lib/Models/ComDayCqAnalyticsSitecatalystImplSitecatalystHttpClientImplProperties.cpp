

#include "ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.h"

using namespace Tiny;

ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties()
{
	cqanalyticssitecatalystservicedatacenterurl = ConfigNodePropertyArray();
	devhostnamepatterns = ConfigNodePropertyArray();
	connectiontimeout = ConfigNodePropertyInteger();
	sockettimeout = ConfigNodePropertyInteger();
}

ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::~ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties()
{

}

void
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqanalyticssitecatalystservicedatacenterurlKey = "cq.analytics.sitecatalyst.service.datacenter.url";

    if(object.has_key(cqanalyticssitecatalystservicedatacenterurlKey))
    {
        bourne::json value = object[cqanalyticssitecatalystservicedatacenterurlKey];




        ConfigNodePropertyArray* obj = &cqanalyticssitecatalystservicedatacenterurl;
		obj->fromJson(value.dump());

    }

    const char *devhostnamepatternsKey = "devhostnamepatterns";

    if(object.has_key(devhostnamepatternsKey))
    {
        bourne::json value = object[devhostnamepatternsKey];




        ConfigNodePropertyArray* obj = &devhostnamepatterns;
		obj->fromJson(value.dump());

    }

    const char *connectiontimeoutKey = "connection.timeout";

    if(object.has_key(connectiontimeoutKey))
    {
        bourne::json value = object[connectiontimeoutKey];




        ConfigNodePropertyInteger* obj = &connectiontimeout;
		obj->fromJson(value.dump());

    }

    const char *sockettimeoutKey = "socket.timeout";

    if(object.has_key(sockettimeoutKey))
    {
        bourne::json value = object[sockettimeoutKey];




        ConfigNodePropertyInteger* obj = &sockettimeout;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqanalyticssitecatalystservicedatacenterurl"] = getCqanalyticssitecatalystservicedatacenterurl().toJson();






	object["devhostnamepatterns"] = getDevhostnamepatterns().toJson();






	object["connectiontimeout"] = getConnectiontimeout().toJson();






	object["sockettimeout"] = getSockettimeout().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::getCqanalyticssitecatalystservicedatacenterurl()
{
	return cqanalyticssitecatalystservicedatacenterurl;
}

void
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::setCqanalyticssitecatalystservicedatacenterurl(ConfigNodePropertyArray cqanalyticssitecatalystservicedatacenterurl)
{
	this->cqanalyticssitecatalystservicedatacenterurl = cqanalyticssitecatalystservicedatacenterurl;
}

ConfigNodePropertyArray
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::getDevhostnamepatterns()
{
	return devhostnamepatterns;
}

void
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::setDevhostnamepatterns(ConfigNodePropertyArray devhostnamepatterns)
{
	this->devhostnamepatterns = devhostnamepatterns;
}

ConfigNodePropertyInteger
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::getConnectiontimeout()
{
	return connectiontimeout;
}

void
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::setConnectiontimeout(ConfigNodePropertyInteger connectiontimeout)
{
	this->connectiontimeout = connectiontimeout;
}

ConfigNodePropertyInteger
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::getSockettimeout()
{
	return sockettimeout;
}

void
ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties::setSockettimeout(ConfigNodePropertyInteger sockettimeout)
{
	this->sockettimeout = sockettimeout;
}



