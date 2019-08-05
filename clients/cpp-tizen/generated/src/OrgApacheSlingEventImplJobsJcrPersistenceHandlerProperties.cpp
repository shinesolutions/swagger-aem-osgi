#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties()
{
	//__init();
}

OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::~OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties()
{
	//__cleanup();
}

void
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::__init()
{
	//jobconsumermanagerdisableDistribution = new ConfigNodePropertyBoolean();
	//startupdelay = new ConfigNodePropertyInteger();
	//cleanupperiod = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::__cleanup()
{
	//if(jobconsumermanagerdisableDistribution != NULL) {
	//
	//delete jobconsumermanagerdisableDistribution;
	//jobconsumermanagerdisableDistribution = NULL;
	//}
	//if(startupdelay != NULL) {
	//
	//delete startupdelay;
	//startupdelay = NULL;
	//}
	//if(cleanupperiod != NULL) {
	//
	//delete cleanupperiod;
	//cleanupperiod = NULL;
	//}
	//
}

void
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *jobconsumermanagerdisableDistributionKey = "job.consumermanager.disableDistribution";
	node = json_object_get_member(pJsonObject, jobconsumermanagerdisableDistributionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&jobconsumermanagerdisableDistribution, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&jobconsumermanagerdisableDistribution);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *startupdelayKey = "startup.delay";
	node = json_object_get_member(pJsonObject, startupdelayKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&startupdelay, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&startupdelay);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cleanupperiodKey = "cleanup.period";
	node = json_object_get_member(pJsonObject, cleanupperiodKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cleanupperiod, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cleanupperiod);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getJobconsumermanagerdisableDistribution();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getJobconsumermanagerdisableDistribution());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jobconsumermanagerdisableDistributionKey = "job.consumermanager.disableDistribution";
	json_object_set_member(pJsonObject, jobconsumermanagerdisableDistributionKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getStartupdelay();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getStartupdelay());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *startupdelayKey = "startup.delay";
	json_object_set_member(pJsonObject, startupdelayKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCleanupperiod();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCleanupperiod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cleanupperiodKey = "cleanup.period";
	json_object_set_member(pJsonObject, cleanupperiodKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::getJobconsumermanagerdisableDistribution()
{
	return jobconsumermanagerdisableDistribution;
}

void
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::setJobconsumermanagerdisableDistribution(ConfigNodePropertyBoolean  jobconsumermanagerdisableDistribution)
{
	this->jobconsumermanagerdisableDistribution = jobconsumermanagerdisableDistribution;
}

ConfigNodePropertyInteger
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::getStartupdelay()
{
	return startupdelay;
}

void
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::setStartupdelay(ConfigNodePropertyInteger  startupdelay)
{
	this->startupdelay = startupdelay;
}

ConfigNodePropertyInteger
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::getCleanupperiod()
{
	return cleanupperiod;
}

void
OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties::setCleanupperiod(ConfigNodePropertyInteger  cleanupperiod)
{
	this->cleanupperiod = cleanupperiod;
}


