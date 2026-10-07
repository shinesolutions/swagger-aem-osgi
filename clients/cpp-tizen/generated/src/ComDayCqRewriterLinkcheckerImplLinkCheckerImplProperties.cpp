#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties()
{
	//__init();
}

ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::~ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties()
{
	//__cleanup();
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::__init()
{
	//schedulerperiod = new ConfigNodePropertyInteger();
	//schedulerconcurrent = new ConfigNodePropertyBoolean();
	//servicebad_link_tolerance_interval = new ConfigNodePropertyInteger();
	//servicecheck_override_patterns = new ConfigNodePropertyArray();
	//servicecache_broken_internal_links = new ConfigNodePropertyBoolean();
	//servicespecial_link_prefix = new ConfigNodePropertyArray();
	//servicespecial_link_patterns = new ConfigNodePropertyArray();
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::__cleanup()
{
	//if(schedulerperiod != NULL) {
	//
	//delete schedulerperiod;
	//schedulerperiod = NULL;
	//}
	//if(schedulerconcurrent != NULL) {
	//
	//delete schedulerconcurrent;
	//schedulerconcurrent = NULL;
	//}
	//if(servicebad_link_tolerance_interval != NULL) {
	//
	//delete servicebad_link_tolerance_interval;
	//servicebad_link_tolerance_interval = NULL;
	//}
	//if(servicecheck_override_patterns != NULL) {
	//
	//delete servicecheck_override_patterns;
	//servicecheck_override_patterns = NULL;
	//}
	//if(servicecache_broken_internal_links != NULL) {
	//
	//delete servicecache_broken_internal_links;
	//servicecache_broken_internal_links = NULL;
	//}
	//if(servicespecial_link_prefix != NULL) {
	//
	//delete servicespecial_link_prefix;
	//servicespecial_link_prefix = NULL;
	//}
	//if(servicespecial_link_patterns != NULL) {
	//
	//delete servicespecial_link_patterns;
	//servicespecial_link_patterns = NULL;
	//}
	//
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *schedulerperiodKey = "scheduler.period";
	node = json_object_get_member(pJsonObject, schedulerperiodKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&schedulerperiod, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&schedulerperiod);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *schedulerconcurrentKey = "scheduler.concurrent";
	node = json_object_get_member(pJsonObject, schedulerconcurrentKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&schedulerconcurrent, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&schedulerconcurrent);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servicebad_link_tolerance_intervalKey = "service.bad_link_tolerance_interval";
	node = json_object_get_member(pJsonObject, servicebad_link_tolerance_intervalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&servicebad_link_tolerance_interval, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&servicebad_link_tolerance_interval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servicecheck_override_patternsKey = "service.check_override_patterns";
	node = json_object_get_member(pJsonObject, servicecheck_override_patternsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&servicecheck_override_patterns, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&servicecheck_override_patterns);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servicecache_broken_internal_linksKey = "service.cache_broken_internal_links";
	node = json_object_get_member(pJsonObject, servicecache_broken_internal_linksKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&servicecache_broken_internal_links, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&servicecache_broken_internal_links);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servicespecial_link_prefixKey = "service.special_link_prefix";
	node = json_object_get_member(pJsonObject, servicespecial_link_prefixKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&servicespecial_link_prefix, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&servicespecial_link_prefix);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servicespecial_link_patternsKey = "service.special_link_patterns";
	node = json_object_get_member(pJsonObject, servicespecial_link_patternsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&servicespecial_link_patterns, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&servicespecial_link_patterns);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSchedulerperiod();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSchedulerperiod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedulerperiodKey = "scheduler.period";
	json_object_set_member(pJsonObject, schedulerperiodKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getSchedulerconcurrent();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getSchedulerconcurrent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schedulerconcurrentKey = "scheduler.concurrent";
	json_object_set_member(pJsonObject, schedulerconcurrentKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getServicebadLinkToleranceInterval();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getServicebadLinkToleranceInterval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicebad_link_tolerance_intervalKey = "service.bad_link_tolerance_interval";
	json_object_set_member(pJsonObject, servicebad_link_tolerance_intervalKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getServicecheckOverridePatterns();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getServicecheckOverridePatterns());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicecheck_override_patternsKey = "service.check_override_patterns";
	json_object_set_member(pJsonObject, servicecheck_override_patternsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getServicecacheBrokenInternalLinks();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getServicecacheBrokenInternalLinks());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicecache_broken_internal_linksKey = "service.cache_broken_internal_links";
	json_object_set_member(pJsonObject, servicecache_broken_internal_linksKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getServicespecialLinkPrefix();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getServicespecialLinkPrefix());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicespecial_link_prefixKey = "service.special_link_prefix";
	json_object_set_member(pJsonObject, servicespecial_link_prefixKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getServicespecialLinkPatterns();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getServicespecialLinkPatterns());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicespecial_link_patternsKey = "service.special_link_patterns";
	json_object_set_member(pJsonObject, servicespecial_link_patternsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getSchedulerperiod()
{
	return schedulerperiod;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setSchedulerperiod(ConfigNodePropertyInteger  schedulerperiod)
{
	this->schedulerperiod = schedulerperiod;
}

ConfigNodePropertyBoolean
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getSchedulerconcurrent()
{
	return schedulerconcurrent;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setSchedulerconcurrent(ConfigNodePropertyBoolean  schedulerconcurrent)
{
	this->schedulerconcurrent = schedulerconcurrent;
}

ConfigNodePropertyInteger
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getServicebadLinkToleranceInterval()
{
	return servicebad_link_tolerance_interval;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setServicebadLinkToleranceInterval(ConfigNodePropertyInteger  servicebad_link_tolerance_interval)
{
	this->servicebad_link_tolerance_interval = servicebad_link_tolerance_interval;
}

ConfigNodePropertyArray
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getServicecheckOverridePatterns()
{
	return servicecheck_override_patterns;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setServicecheckOverridePatterns(ConfigNodePropertyArray  servicecheck_override_patterns)
{
	this->servicecheck_override_patterns = servicecheck_override_patterns;
}

ConfigNodePropertyBoolean
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getServicecacheBrokenInternalLinks()
{
	return servicecache_broken_internal_links;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setServicecacheBrokenInternalLinks(ConfigNodePropertyBoolean  servicecache_broken_internal_links)
{
	this->servicecache_broken_internal_links = servicecache_broken_internal_links;
}

ConfigNodePropertyArray
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getServicespecialLinkPrefix()
{
	return servicespecial_link_prefix;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setServicespecialLinkPrefix(ConfigNodePropertyArray  servicespecial_link_prefix)
{
	this->servicespecial_link_prefix = servicespecial_link_prefix;
}

ConfigNodePropertyArray
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getServicespecialLinkPatterns()
{
	return servicespecial_link_patterns;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setServicespecialLinkPatterns(ConfigNodePropertyArray  servicespecial_link_patterns)
{
	this->servicespecial_link_patterns = servicespecial_link_patterns;
}


