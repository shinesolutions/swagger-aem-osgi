#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingEventImplJobsJobConsumerManagerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingEventImplJobsJobConsumerManagerProperties::OrgApacheSlingEventImplJobsJobConsumerManagerProperties()
{
	//__init();
}

OrgApacheSlingEventImplJobsJobConsumerManagerProperties::~OrgApacheSlingEventImplJobsJobConsumerManagerProperties()
{
	//__cleanup();
}

void
OrgApacheSlingEventImplJobsJobConsumerManagerProperties::__init()
{
	//orgapacheslinginstallerconfigurationpersist = new ConfigNodePropertyBoolean();
	//jobconsumermanagerwhitelist = new ConfigNodePropertyArray();
	//jobconsumermanagerblacklist = new ConfigNodePropertyArray();
}

void
OrgApacheSlingEventImplJobsJobConsumerManagerProperties::__cleanup()
{
	//if(orgapacheslinginstallerconfigurationpersist != NULL) {
	//
	//delete orgapacheslinginstallerconfigurationpersist;
	//orgapacheslinginstallerconfigurationpersist = NULL;
	//}
	//if(jobconsumermanagerwhitelist != NULL) {
	//
	//delete jobconsumermanagerwhitelist;
	//jobconsumermanagerwhitelist = NULL;
	//}
	//if(jobconsumermanagerblacklist != NULL) {
	//
	//delete jobconsumermanagerblacklist;
	//jobconsumermanagerblacklist = NULL;
	//}
	//
}

void
OrgApacheSlingEventImplJobsJobConsumerManagerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *orgapacheslinginstallerconfigurationpersistKey = "org.apache.sling.installer.configuration.persist";
	node = json_object_get_member(pJsonObject, orgapacheslinginstallerconfigurationpersistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&orgapacheslinginstallerconfigurationpersist, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&orgapacheslinginstallerconfigurationpersist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jobconsumermanagerwhitelistKey = "job.consumermanager.whitelist";
	node = json_object_get_member(pJsonObject, jobconsumermanagerwhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&jobconsumermanagerwhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&jobconsumermanagerwhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jobconsumermanagerblacklistKey = "job.consumermanager.blacklist";
	node = json_object_get_member(pJsonObject, jobconsumermanagerblacklistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&jobconsumermanagerblacklist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&jobconsumermanagerblacklist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingEventImplJobsJobConsumerManagerProperties::OrgApacheSlingEventImplJobsJobConsumerManagerProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingEventImplJobsJobConsumerManagerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOrgapacheslinginstallerconfigurationpersist();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOrgapacheslinginstallerconfigurationpersist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslinginstallerconfigurationpersistKey = "org.apache.sling.installer.configuration.persist";
	json_object_set_member(pJsonObject, orgapacheslinginstallerconfigurationpersistKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getJobconsumermanagerwhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getJobconsumermanagerwhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jobconsumermanagerwhitelistKey = "job.consumermanager.whitelist";
	json_object_set_member(pJsonObject, jobconsumermanagerwhitelistKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getJobconsumermanagerblacklist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getJobconsumermanagerblacklist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jobconsumermanagerblacklistKey = "job.consumermanager.blacklist";
	json_object_set_member(pJsonObject, jobconsumermanagerblacklistKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
OrgApacheSlingEventImplJobsJobConsumerManagerProperties::getOrgapacheslinginstallerconfigurationpersist()
{
	return orgapacheslinginstallerconfigurationpersist;
}

void
OrgApacheSlingEventImplJobsJobConsumerManagerProperties::setOrgapacheslinginstallerconfigurationpersist(ConfigNodePropertyBoolean  orgapacheslinginstallerconfigurationpersist)
{
	this->orgapacheslinginstallerconfigurationpersist = orgapacheslinginstallerconfigurationpersist;
}

ConfigNodePropertyArray
OrgApacheSlingEventImplJobsJobConsumerManagerProperties::getJobconsumermanagerwhitelist()
{
	return jobconsumermanagerwhitelist;
}

void
OrgApacheSlingEventImplJobsJobConsumerManagerProperties::setJobconsumermanagerwhitelist(ConfigNodePropertyArray  jobconsumermanagerwhitelist)
{
	this->jobconsumermanagerwhitelist = jobconsumermanagerwhitelist;
}

ConfigNodePropertyArray
OrgApacheSlingEventImplJobsJobConsumerManagerProperties::getJobconsumermanagerblacklist()
{
	return jobconsumermanagerblacklist;
}

void
OrgApacheSlingEventImplJobsJobConsumerManagerProperties::setJobconsumermanagerblacklist(ConfigNodePropertyArray  jobconsumermanagerblacklist)
{
	this->jobconsumermanagerblacklist = jobconsumermanagerblacklist;
}


