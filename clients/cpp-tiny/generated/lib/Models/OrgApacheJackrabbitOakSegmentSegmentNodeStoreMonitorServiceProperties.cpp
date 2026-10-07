

#include "OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties::OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties()
{
	commitsTrackerWriterGroups = ConfigNodePropertyArray();
}

OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties::OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties::~OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties()
{

}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *commitsTrackerWriterGroupsKey = "commitsTrackerWriterGroups";

    if(object.has_key(commitsTrackerWriterGroupsKey))
    {
        bourne::json value = object[commitsTrackerWriterGroupsKey];




        ConfigNodePropertyArray* obj = &commitsTrackerWriterGroups;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["commitsTrackerWriterGroups"] = getCommitsTrackerWriterGroups().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties::getCommitsTrackerWriterGroups()
{
	return commitsTrackerWriterGroups;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties::setCommitsTrackerWriterGroups(ConfigNodePropertyArray commitsTrackerWriterGroups)
{
	this->commitsTrackerWriterGroups = commitsTrackerWriterGroups;
}



