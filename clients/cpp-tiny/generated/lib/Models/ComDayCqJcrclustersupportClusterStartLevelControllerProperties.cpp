

#include "ComDayCqJcrclustersupportClusterStartLevelControllerProperties.h"

using namespace Tiny;

ComDayCqJcrclustersupportClusterStartLevelControllerProperties::ComDayCqJcrclustersupportClusterStartLevelControllerProperties()
{
	clusterlevelenable = ConfigNodePropertyBoolean();
	clustermasterlevel = ConfigNodePropertyInteger();
	clusterslavelevel = ConfigNodePropertyInteger();
}

ComDayCqJcrclustersupportClusterStartLevelControllerProperties::ComDayCqJcrclustersupportClusterStartLevelControllerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqJcrclustersupportClusterStartLevelControllerProperties::~ComDayCqJcrclustersupportClusterStartLevelControllerProperties()
{

}

void
ComDayCqJcrclustersupportClusterStartLevelControllerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *clusterlevelenableKey = "cluster.level.enable";

    if(object.has_key(clusterlevelenableKey))
    {
        bourne::json value = object[clusterlevelenableKey];




        ConfigNodePropertyBoolean* obj = &clusterlevelenable;
		obj->fromJson(value.dump());

    }

    const char *clustermasterlevelKey = "cluster.master.level";

    if(object.has_key(clustermasterlevelKey))
    {
        bourne::json value = object[clustermasterlevelKey];




        ConfigNodePropertyInteger* obj = &clustermasterlevel;
		obj->fromJson(value.dump());

    }

    const char *clusterslavelevelKey = "cluster.slave.level";

    if(object.has_key(clusterslavelevelKey))
    {
        bourne::json value = object[clusterslavelevelKey];




        ConfigNodePropertyInteger* obj = &clusterslavelevel;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqJcrclustersupportClusterStartLevelControllerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["clusterlevelenable"] = getClusterlevelenable().toJson();






	object["clustermasterlevel"] = getClustermasterlevel().toJson();






	object["clusterslavelevel"] = getClusterslavelevel().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqJcrclustersupportClusterStartLevelControllerProperties::getClusterlevelenable()
{
	return clusterlevelenable;
}

void
ComDayCqJcrclustersupportClusterStartLevelControllerProperties::setClusterlevelenable(ConfigNodePropertyBoolean clusterlevelenable)
{
	this->clusterlevelenable = clusterlevelenable;
}

ConfigNodePropertyInteger
ComDayCqJcrclustersupportClusterStartLevelControllerProperties::getClustermasterlevel()
{
	return clustermasterlevel;
}

void
ComDayCqJcrclustersupportClusterStartLevelControllerProperties::setClustermasterlevel(ConfigNodePropertyInteger clustermasterlevel)
{
	this->clustermasterlevel = clustermasterlevel;
}

ConfigNodePropertyInteger
ComDayCqJcrclustersupportClusterStartLevelControllerProperties::getClusterslavelevel()
{
	return clusterslavelevel;
}

void
ComDayCqJcrclustersupportClusterStartLevelControllerProperties::setClusterslavelevel(ConfigNodePropertyInteger clusterslavelevel)
{
	this->clusterslavelevel = clusterslavelevel;
}



