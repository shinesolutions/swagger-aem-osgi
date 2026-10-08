

#include "OrgApacheSlingEventImplJobsJobConsumerManagerProperties.h"

using namespace Tiny;

OrgApacheSlingEventImplJobsJobConsumerManagerProperties::OrgApacheSlingEventImplJobsJobConsumerManagerProperties()
{
	orgapacheslinginstallerconfigurationpersist = ConfigNodePropertyBoolean();
	jobconsumermanagerwhitelist = ConfigNodePropertyArray();
	jobconsumermanagerblacklist = ConfigNodePropertyArray();
}

OrgApacheSlingEventImplJobsJobConsumerManagerProperties::OrgApacheSlingEventImplJobsJobConsumerManagerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingEventImplJobsJobConsumerManagerProperties::~OrgApacheSlingEventImplJobsJobConsumerManagerProperties()
{

}

void
OrgApacheSlingEventImplJobsJobConsumerManagerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orgapacheslinginstallerconfigurationpersistKey = "org.apache.sling.installer.configuration.persist";

    if(object.has_key(orgapacheslinginstallerconfigurationpersistKey))
    {
        bourne::json value = object[orgapacheslinginstallerconfigurationpersistKey];




        ConfigNodePropertyBoolean* obj = &orgapacheslinginstallerconfigurationpersist;
		obj->fromJson(value.dump());

    }

    const char *jobconsumermanagerwhitelistKey = "job.consumermanager.whitelist";

    if(object.has_key(jobconsumermanagerwhitelistKey))
    {
        bourne::json value = object[jobconsumermanagerwhitelistKey];




        ConfigNodePropertyArray* obj = &jobconsumermanagerwhitelist;
		obj->fromJson(value.dump());

    }

    const char *jobconsumermanagerblacklistKey = "job.consumermanager.blacklist";

    if(object.has_key(jobconsumermanagerblacklistKey))
    {
        bourne::json value = object[jobconsumermanagerblacklistKey];




        ConfigNodePropertyArray* obj = &jobconsumermanagerblacklist;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingEventImplJobsJobConsumerManagerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["orgapacheslinginstallerconfigurationpersist"] = getOrgapacheslinginstallerconfigurationpersist().toJson();






	object["jobconsumermanagerwhitelist"] = getJobconsumermanagerwhitelist().toJson();






	object["jobconsumermanagerblacklist"] = getJobconsumermanagerblacklist().toJson();


    return object;

}

ConfigNodePropertyBoolean
OrgApacheSlingEventImplJobsJobConsumerManagerProperties::getOrgapacheslinginstallerconfigurationpersist()
{
	return orgapacheslinginstallerconfigurationpersist;
}

void
OrgApacheSlingEventImplJobsJobConsumerManagerProperties::setOrgapacheslinginstallerconfigurationpersist(ConfigNodePropertyBoolean orgapacheslinginstallerconfigurationpersist)
{
	this->orgapacheslinginstallerconfigurationpersist = orgapacheslinginstallerconfigurationpersist;
}

ConfigNodePropertyArray
OrgApacheSlingEventImplJobsJobConsumerManagerProperties::getJobconsumermanagerwhitelist()
{
	return jobconsumermanagerwhitelist;
}

void
OrgApacheSlingEventImplJobsJobConsumerManagerProperties::setJobconsumermanagerwhitelist(ConfigNodePropertyArray jobconsumermanagerwhitelist)
{
	this->jobconsumermanagerwhitelist = jobconsumermanagerwhitelist;
}

ConfigNodePropertyArray
OrgApacheSlingEventImplJobsJobConsumerManagerProperties::getJobconsumermanagerblacklist()
{
	return jobconsumermanagerblacklist;
}

void
OrgApacheSlingEventImplJobsJobConsumerManagerProperties::setJobconsumermanagerblacklist(ConfigNodePropertyArray jobconsumermanagerblacklist)
{
	this->jobconsumermanagerblacklist = jobconsumermanagerblacklist;
}



