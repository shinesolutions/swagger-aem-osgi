#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::ComAdobeGraniteRepositoryImplCommitStatsConfigProperties()
{
	//__init();
}

ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::~ComAdobeGraniteRepositoryImplCommitStatsConfigProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::__init()
{
	//enabled = new ConfigNodePropertyBoolean();
	//intervalSeconds = new ConfigNodePropertyInteger();
	//commitsPerIntervalThreshold = new ConfigNodePropertyInteger();
	//maxLocationLength = new ConfigNodePropertyInteger();
	//maxDetailsShown = new ConfigNodePropertyInteger();
	//minDetailsPercentage = new ConfigNodePropertyInteger();
	//threadMatchers = new ConfigNodePropertyArray();
	//maxGreedyDepth = new ConfigNodePropertyInteger();
	//greedyStackMatchers = new ConfigNodePropertyString();
	//stackFilters = new ConfigNodePropertyArray();
	//stackMatchers = new ConfigNodePropertyArray();
	//stackCategorizers = new ConfigNodePropertyArray();
	//stackShorteners = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::__cleanup()
{
	//if(enabled != NULL) {
	//
	//delete enabled;
	//enabled = NULL;
	//}
	//if(intervalSeconds != NULL) {
	//
	//delete intervalSeconds;
	//intervalSeconds = NULL;
	//}
	//if(commitsPerIntervalThreshold != NULL) {
	//
	//delete commitsPerIntervalThreshold;
	//commitsPerIntervalThreshold = NULL;
	//}
	//if(maxLocationLength != NULL) {
	//
	//delete maxLocationLength;
	//maxLocationLength = NULL;
	//}
	//if(maxDetailsShown != NULL) {
	//
	//delete maxDetailsShown;
	//maxDetailsShown = NULL;
	//}
	//if(minDetailsPercentage != NULL) {
	//
	//delete minDetailsPercentage;
	//minDetailsPercentage = NULL;
	//}
	//if(threadMatchers != NULL) {
	//
	//delete threadMatchers;
	//threadMatchers = NULL;
	//}
	//if(maxGreedyDepth != NULL) {
	//
	//delete maxGreedyDepth;
	//maxGreedyDepth = NULL;
	//}
	//if(greedyStackMatchers != NULL) {
	//
	//delete greedyStackMatchers;
	//greedyStackMatchers = NULL;
	//}
	//if(stackFilters != NULL) {
	//
	//delete stackFilters;
	//stackFilters = NULL;
	//}
	//if(stackMatchers != NULL) {
	//
	//delete stackMatchers;
	//stackMatchers = NULL;
	//}
	//if(stackCategorizers != NULL) {
	//
	//delete stackCategorizers;
	//stackCategorizers = NULL;
	//}
	//if(stackShorteners != NULL) {
	//
	//delete stackShorteners;
	//stackShorteners = NULL;
	//}
	//
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *enabledKey = "enabled";
	node = json_object_get_member(pJsonObject, enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *intervalSecondsKey = "intervalSeconds";
	node = json_object_get_member(pJsonObject, intervalSecondsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&intervalSeconds, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&intervalSeconds);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *commitsPerIntervalThresholdKey = "commitsPerIntervalThreshold";
	node = json_object_get_member(pJsonObject, commitsPerIntervalThresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&commitsPerIntervalThreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&commitsPerIntervalThreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxLocationLengthKey = "maxLocationLength";
	node = json_object_get_member(pJsonObject, maxLocationLengthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxLocationLength, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxLocationLength);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxDetailsShownKey = "maxDetailsShown";
	node = json_object_get_member(pJsonObject, maxDetailsShownKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxDetailsShown, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxDetailsShown);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *minDetailsPercentageKey = "minDetailsPercentage";
	node = json_object_get_member(pJsonObject, minDetailsPercentageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&minDetailsPercentage, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&minDetailsPercentage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *threadMatchersKey = "threadMatchers";
	node = json_object_get_member(pJsonObject, threadMatchersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&threadMatchers, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&threadMatchers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxGreedyDepthKey = "maxGreedyDepth";
	node = json_object_get_member(pJsonObject, maxGreedyDepthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxGreedyDepth, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxGreedyDepth);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *greedyStackMatchersKey = "greedyStackMatchers";
	node = json_object_get_member(pJsonObject, greedyStackMatchersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&greedyStackMatchers, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&greedyStackMatchers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *stackFiltersKey = "stackFilters";
	node = json_object_get_member(pJsonObject, stackFiltersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&stackFilters, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&stackFilters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *stackMatchersKey = "stackMatchers";
	node = json_object_get_member(pJsonObject, stackMatchersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&stackMatchers, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&stackMatchers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *stackCategorizersKey = "stackCategorizers";
	node = json_object_get_member(pJsonObject, stackCategorizersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&stackCategorizers, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&stackCategorizers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *stackShortenersKey = "stackShorteners";
	node = json_object_get_member(pJsonObject, stackShortenersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&stackShorteners, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&stackShorteners);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::ComAdobeGraniteRepositoryImplCommitStatsConfigProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enabledKey = "enabled";
	json_object_set_member(pJsonObject, enabledKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getIntervalSeconds();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getIntervalSeconds());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *intervalSecondsKey = "intervalSeconds";
	json_object_set_member(pJsonObject, intervalSecondsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCommitsPerIntervalThreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCommitsPerIntervalThreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *commitsPerIntervalThresholdKey = "commitsPerIntervalThreshold";
	json_object_set_member(pJsonObject, commitsPerIntervalThresholdKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxLocationLength();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxLocationLength());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxLocationLengthKey = "maxLocationLength";
	json_object_set_member(pJsonObject, maxLocationLengthKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxDetailsShown();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxDetailsShown());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxDetailsShownKey = "maxDetailsShown";
	json_object_set_member(pJsonObject, maxDetailsShownKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMinDetailsPercentage();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMinDetailsPercentage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *minDetailsPercentageKey = "minDetailsPercentage";
	json_object_set_member(pJsonObject, minDetailsPercentageKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getThreadMatchers();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getThreadMatchers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *threadMatchersKey = "threadMatchers";
	json_object_set_member(pJsonObject, threadMatchersKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxGreedyDepth();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxGreedyDepth());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxGreedyDepthKey = "maxGreedyDepth";
	json_object_set_member(pJsonObject, maxGreedyDepthKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getGreedyStackMatchers();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getGreedyStackMatchers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *greedyStackMatchersKey = "greedyStackMatchers";
	json_object_set_member(pJsonObject, greedyStackMatchersKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getStackFilters();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getStackFilters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *stackFiltersKey = "stackFilters";
	json_object_set_member(pJsonObject, stackFiltersKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getStackMatchers();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getStackMatchers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *stackMatchersKey = "stackMatchers";
	json_object_set_member(pJsonObject, stackMatchersKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getStackCategorizers();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getStackCategorizers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *stackCategorizersKey = "stackCategorizers";
	json_object_set_member(pJsonObject, stackCategorizersKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getStackShorteners();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getStackShorteners());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *stackShortenersKey = "stackShorteners";
	json_object_set_member(pJsonObject, stackShortenersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getEnabled()
{
	return enabled;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setEnabled(ConfigNodePropertyBoolean  enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyInteger
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getIntervalSeconds()
{
	return intervalSeconds;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setIntervalSeconds(ConfigNodePropertyInteger  intervalSeconds)
{
	this->intervalSeconds = intervalSeconds;
}

ConfigNodePropertyInteger
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getCommitsPerIntervalThreshold()
{
	return commitsPerIntervalThreshold;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setCommitsPerIntervalThreshold(ConfigNodePropertyInteger  commitsPerIntervalThreshold)
{
	this->commitsPerIntervalThreshold = commitsPerIntervalThreshold;
}

ConfigNodePropertyInteger
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getMaxLocationLength()
{
	return maxLocationLength;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setMaxLocationLength(ConfigNodePropertyInteger  maxLocationLength)
{
	this->maxLocationLength = maxLocationLength;
}

ConfigNodePropertyInteger
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getMaxDetailsShown()
{
	return maxDetailsShown;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setMaxDetailsShown(ConfigNodePropertyInteger  maxDetailsShown)
{
	this->maxDetailsShown = maxDetailsShown;
}

ConfigNodePropertyInteger
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getMinDetailsPercentage()
{
	return minDetailsPercentage;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setMinDetailsPercentage(ConfigNodePropertyInteger  minDetailsPercentage)
{
	this->minDetailsPercentage = minDetailsPercentage;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getThreadMatchers()
{
	return threadMatchers;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setThreadMatchers(ConfigNodePropertyArray  threadMatchers)
{
	this->threadMatchers = threadMatchers;
}

ConfigNodePropertyInteger
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getMaxGreedyDepth()
{
	return maxGreedyDepth;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setMaxGreedyDepth(ConfigNodePropertyInteger  maxGreedyDepth)
{
	this->maxGreedyDepth = maxGreedyDepth;
}

ConfigNodePropertyString
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getGreedyStackMatchers()
{
	return greedyStackMatchers;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setGreedyStackMatchers(ConfigNodePropertyString  greedyStackMatchers)
{
	this->greedyStackMatchers = greedyStackMatchers;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getStackFilters()
{
	return stackFilters;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setStackFilters(ConfigNodePropertyArray  stackFilters)
{
	this->stackFilters = stackFilters;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getStackMatchers()
{
	return stackMatchers;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setStackMatchers(ConfigNodePropertyArray  stackMatchers)
{
	this->stackMatchers = stackMatchers;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getStackCategorizers()
{
	return stackCategorizers;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setStackCategorizers(ConfigNodePropertyArray  stackCategorizers)
{
	this->stackCategorizers = stackCategorizers;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getStackShorteners()
{
	return stackShorteners;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setStackShorteners(ConfigNodePropertyArray  stackShorteners)
{
	this->stackShorteners = stackShorteners;
}


