

#include "ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties.h"

using namespace Tiny;

ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties::ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties()
{
	cqanalyticsadapterfactorycontextstores = ConfigNodePropertyArray();
}

ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties::ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties::~ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties()
{

}

void
ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqanalyticsadapterfactorycontextstoresKey = "cq.analytics.adapterfactory.contextstores";

    if(object.has_key(cqanalyticsadapterfactorycontextstoresKey))
    {
        bourne::json value = object[cqanalyticsadapterfactorycontextstoresKey];




        ConfigNodePropertyArray* obj = &cqanalyticsadapterfactorycontextstores;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqanalyticsadapterfactorycontextstores"] = getCqanalyticsadapterfactorycontextstores().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties::getCqanalyticsadapterfactorycontextstores()
{
	return cqanalyticsadapterfactorycontextstores;
}

void
ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties::setCqanalyticsadapterfactorycontextstores(ConfigNodePropertyArray cqanalyticsadapterfactorycontextstores)
{
	this->cqanalyticsadapterfactorycontextstores = cqanalyticsadapterfactorycontextstores;
}



