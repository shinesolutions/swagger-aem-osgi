#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties()
{
	//__init();
}

ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::~ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties()
{
	//__cleanup();
}

void
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::__init()
{
	//schedulerexpression = new ConfigNodePropertyString();
	//jobpurgethreshold = new ConfigNodePropertyInteger();
	//jobpurgemaxjobs = new ConfigNodePropertyInteger();
}

void
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::__cleanup()
{
	//if(schedulerexpression != NULL) {
	//
	//delete schedulerexpression;
	//schedulerexpression = NULL;
	//}
	//if(jobpurgethreshold != NULL) {
	//
	//delete jobpurgethreshold;
	//jobpurgethreshold = NULL;
	//}
	//if(jobpurgemaxjobs != NULL) {
	//
	//delete jobpurgemaxjobs;
	//jobpurgemaxjobs = NULL;
	//}
	//
}

void
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *schedulerexpressionKey = "scheduler.expression";
	node = json_object_get_member(pJsonObject, schedulerexpressionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&schedulerexpression, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&schedulerexpression);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jobpurgethresholdKey = "job.purge.threshold";
	node = json_object_get_member(pJsonObject, jobpurgethresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&jobpurgethreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&jobpurgethreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jobpurgemaxjobsKey = "job.purge.max.jobs";
	node = json_object_get_member(pJsonObject, jobpurgemaxjobsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&jobpurgemaxjobs, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&jobpurgemaxjobs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSchedulerexpression();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSchedulerexpression());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedulerexpressionKey = "scheduler.expression";
	json_object_set_member(pJsonObject, schedulerexpressionKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getJobpurgethreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getJobpurgethreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jobpurgethresholdKey = "job.purge.threshold";
	json_object_set_member(pJsonObject, jobpurgethresholdKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getJobpurgemaxjobs();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getJobpurgemaxjobs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jobpurgemaxjobsKey = "job.purge.max.jobs";
	json_object_set_member(pJsonObject, jobpurgemaxjobsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::setSchedulerexpression(ConfigNodePropertyString  schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}

ConfigNodePropertyInteger
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::getJobpurgethreshold()
{
	return jobpurgethreshold;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::setJobpurgethreshold(ConfigNodePropertyInteger  jobpurgethreshold)
{
	this->jobpurgethreshold = jobpurgethreshold;
}

ConfigNodePropertyInteger
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::getJobpurgemaxjobs()
{
	return jobpurgemaxjobs;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties::setJobpurgemaxjobs(ConfigNodePropertyInteger  jobpurgemaxjobs)
{
	this->jobpurgemaxjobs = jobpurgemaxjobs;
}


