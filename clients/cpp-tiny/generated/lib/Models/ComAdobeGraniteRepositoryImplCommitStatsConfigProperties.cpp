

#include "ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.h"

using namespace Tiny;

ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::ComAdobeGraniteRepositoryImplCommitStatsConfigProperties()
{
	enabled = ConfigNodePropertyBoolean();
	intervalSeconds = ConfigNodePropertyInteger();
	commitsPerIntervalThreshold = ConfigNodePropertyInteger();
	maxLocationLength = ConfigNodePropertyInteger();
	maxDetailsShown = ConfigNodePropertyInteger();
	minDetailsPercentage = ConfigNodePropertyInteger();
	threadMatchers = ConfigNodePropertyArray();
	maxGreedyDepth = ConfigNodePropertyInteger();
	greedyStackMatchers = ConfigNodePropertyString();
	stackFilters = ConfigNodePropertyArray();
	stackMatchers = ConfigNodePropertyArray();
	stackCategorizers = ConfigNodePropertyArray();
	stackShorteners = ConfigNodePropertyArray();
}

ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::ComAdobeGraniteRepositoryImplCommitStatsConfigProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::~ComAdobeGraniteRepositoryImplCommitStatsConfigProperties()
{

}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];




        ConfigNodePropertyBoolean* obj = &enabled;
		obj->fromJson(value.dump());

    }

    const char *intervalSecondsKey = "intervalSeconds";

    if(object.has_key(intervalSecondsKey))
    {
        bourne::json value = object[intervalSecondsKey];




        ConfigNodePropertyInteger* obj = &intervalSeconds;
		obj->fromJson(value.dump());

    }

    const char *commitsPerIntervalThresholdKey = "commitsPerIntervalThreshold";

    if(object.has_key(commitsPerIntervalThresholdKey))
    {
        bourne::json value = object[commitsPerIntervalThresholdKey];




        ConfigNodePropertyInteger* obj = &commitsPerIntervalThreshold;
		obj->fromJson(value.dump());

    }

    const char *maxLocationLengthKey = "maxLocationLength";

    if(object.has_key(maxLocationLengthKey))
    {
        bourne::json value = object[maxLocationLengthKey];




        ConfigNodePropertyInteger* obj = &maxLocationLength;
		obj->fromJson(value.dump());

    }

    const char *maxDetailsShownKey = "maxDetailsShown";

    if(object.has_key(maxDetailsShownKey))
    {
        bourne::json value = object[maxDetailsShownKey];




        ConfigNodePropertyInteger* obj = &maxDetailsShown;
		obj->fromJson(value.dump());

    }

    const char *minDetailsPercentageKey = "minDetailsPercentage";

    if(object.has_key(minDetailsPercentageKey))
    {
        bourne::json value = object[minDetailsPercentageKey];




        ConfigNodePropertyInteger* obj = &minDetailsPercentage;
		obj->fromJson(value.dump());

    }

    const char *threadMatchersKey = "threadMatchers";

    if(object.has_key(threadMatchersKey))
    {
        bourne::json value = object[threadMatchersKey];




        ConfigNodePropertyArray* obj = &threadMatchers;
		obj->fromJson(value.dump());

    }

    const char *maxGreedyDepthKey = "maxGreedyDepth";

    if(object.has_key(maxGreedyDepthKey))
    {
        bourne::json value = object[maxGreedyDepthKey];




        ConfigNodePropertyInteger* obj = &maxGreedyDepth;
		obj->fromJson(value.dump());

    }

    const char *greedyStackMatchersKey = "greedyStackMatchers";

    if(object.has_key(greedyStackMatchersKey))
    {
        bourne::json value = object[greedyStackMatchersKey];




        ConfigNodePropertyString* obj = &greedyStackMatchers;
		obj->fromJson(value.dump());

    }

    const char *stackFiltersKey = "stackFilters";

    if(object.has_key(stackFiltersKey))
    {
        bourne::json value = object[stackFiltersKey];




        ConfigNodePropertyArray* obj = &stackFilters;
		obj->fromJson(value.dump());

    }

    const char *stackMatchersKey = "stackMatchers";

    if(object.has_key(stackMatchersKey))
    {
        bourne::json value = object[stackMatchersKey];




        ConfigNodePropertyArray* obj = &stackMatchers;
		obj->fromJson(value.dump());

    }

    const char *stackCategorizersKey = "stackCategorizers";

    if(object.has_key(stackCategorizersKey))
    {
        bourne::json value = object[stackCategorizersKey];




        ConfigNodePropertyArray* obj = &stackCategorizers;
		obj->fromJson(value.dump());

    }

    const char *stackShortenersKey = "stackShorteners";

    if(object.has_key(stackShortenersKey))
    {
        bourne::json value = object[stackShortenersKey];




        ConfigNodePropertyArray* obj = &stackShorteners;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enabled"] = getEnabled().toJson();






	object["intervalSeconds"] = getIntervalSeconds().toJson();






	object["commitsPerIntervalThreshold"] = getCommitsPerIntervalThreshold().toJson();






	object["maxLocationLength"] = getMaxLocationLength().toJson();






	object["maxDetailsShown"] = getMaxDetailsShown().toJson();






	object["minDetailsPercentage"] = getMinDetailsPercentage().toJson();






	object["threadMatchers"] = getThreadMatchers().toJson();






	object["maxGreedyDepth"] = getMaxGreedyDepth().toJson();






	object["greedyStackMatchers"] = getGreedyStackMatchers().toJson();






	object["stackFilters"] = getStackFilters().toJson();






	object["stackMatchers"] = getStackMatchers().toJson();






	object["stackCategorizers"] = getStackCategorizers().toJson();






	object["stackShorteners"] = getStackShorteners().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getEnabled()
{
	return enabled;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyInteger
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getIntervalSeconds()
{
	return intervalSeconds;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setIntervalSeconds(ConfigNodePropertyInteger intervalSeconds)
{
	this->intervalSeconds = intervalSeconds;
}

ConfigNodePropertyInteger
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getCommitsPerIntervalThreshold()
{
	return commitsPerIntervalThreshold;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setCommitsPerIntervalThreshold(ConfigNodePropertyInteger commitsPerIntervalThreshold)
{
	this->commitsPerIntervalThreshold = commitsPerIntervalThreshold;
}

ConfigNodePropertyInteger
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getMaxLocationLength()
{
	return maxLocationLength;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setMaxLocationLength(ConfigNodePropertyInteger maxLocationLength)
{
	this->maxLocationLength = maxLocationLength;
}

ConfigNodePropertyInteger
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getMaxDetailsShown()
{
	return maxDetailsShown;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setMaxDetailsShown(ConfigNodePropertyInteger maxDetailsShown)
{
	this->maxDetailsShown = maxDetailsShown;
}

ConfigNodePropertyInteger
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getMinDetailsPercentage()
{
	return minDetailsPercentage;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setMinDetailsPercentage(ConfigNodePropertyInteger minDetailsPercentage)
{
	this->minDetailsPercentage = minDetailsPercentage;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getThreadMatchers()
{
	return threadMatchers;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setThreadMatchers(ConfigNodePropertyArray threadMatchers)
{
	this->threadMatchers = threadMatchers;
}

ConfigNodePropertyInteger
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getMaxGreedyDepth()
{
	return maxGreedyDepth;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setMaxGreedyDepth(ConfigNodePropertyInteger maxGreedyDepth)
{
	this->maxGreedyDepth = maxGreedyDepth;
}

ConfigNodePropertyString
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getGreedyStackMatchers()
{
	return greedyStackMatchers;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setGreedyStackMatchers(ConfigNodePropertyString greedyStackMatchers)
{
	this->greedyStackMatchers = greedyStackMatchers;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getStackFilters()
{
	return stackFilters;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setStackFilters(ConfigNodePropertyArray stackFilters)
{
	this->stackFilters = stackFilters;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getStackMatchers()
{
	return stackMatchers;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setStackMatchers(ConfigNodePropertyArray stackMatchers)
{
	this->stackMatchers = stackMatchers;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getStackCategorizers()
{
	return stackCategorizers;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setStackCategorizers(ConfigNodePropertyArray stackCategorizers)
{
	this->stackCategorizers = stackCategorizers;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::getStackShorteners()
{
	return stackShorteners;
}

void
ComAdobeGraniteRepositoryImplCommitStatsConfigProperties::setStackShorteners(ConfigNodePropertyArray stackShorteners)
{
	this->stackShorteners = stackShorteners;
}



