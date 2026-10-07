

#include "ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.h"

using namespace Tiny;

ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties()
{
	schedulerperiod = ConfigNodePropertyInteger();
	schedulerconcurrent = ConfigNodePropertyBoolean();
	servicebad_link_tolerance_interval = ConfigNodePropertyInteger();
	servicecheck_override_patterns = ConfigNodePropertyArray();
	servicecache_broken_internal_links = ConfigNodePropertyBoolean();
	servicespecial_link_prefix = ConfigNodePropertyArray();
	servicespecial_link_patterns = ConfigNodePropertyArray();
}

ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::~ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties()
{

}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *schedulerperiodKey = "scheduler.period";

    if(object.has_key(schedulerperiodKey))
    {
        bourne::json value = object[schedulerperiodKey];




        ConfigNodePropertyInteger* obj = &schedulerperiod;
		obj->fromJson(value.dump());

    }

    const char *schedulerconcurrentKey = "scheduler.concurrent";

    if(object.has_key(schedulerconcurrentKey))
    {
        bourne::json value = object[schedulerconcurrentKey];




        ConfigNodePropertyBoolean* obj = &schedulerconcurrent;
		obj->fromJson(value.dump());

    }

    const char *servicebad_link_tolerance_intervalKey = "service.bad_link_tolerance_interval";

    if(object.has_key(servicebad_link_tolerance_intervalKey))
    {
        bourne::json value = object[servicebad_link_tolerance_intervalKey];




        ConfigNodePropertyInteger* obj = &servicebad_link_tolerance_interval;
		obj->fromJson(value.dump());

    }

    const char *servicecheck_override_patternsKey = "service.check_override_patterns";

    if(object.has_key(servicecheck_override_patternsKey))
    {
        bourne::json value = object[servicecheck_override_patternsKey];




        ConfigNodePropertyArray* obj = &servicecheck_override_patterns;
		obj->fromJson(value.dump());

    }

    const char *servicecache_broken_internal_linksKey = "service.cache_broken_internal_links";

    if(object.has_key(servicecache_broken_internal_linksKey))
    {
        bourne::json value = object[servicecache_broken_internal_linksKey];




        ConfigNodePropertyBoolean* obj = &servicecache_broken_internal_links;
		obj->fromJson(value.dump());

    }

    const char *servicespecial_link_prefixKey = "service.special_link_prefix";

    if(object.has_key(servicespecial_link_prefixKey))
    {
        bourne::json value = object[servicespecial_link_prefixKey];




        ConfigNodePropertyArray* obj = &servicespecial_link_prefix;
		obj->fromJson(value.dump());

    }

    const char *servicespecial_link_patternsKey = "service.special_link_patterns";

    if(object.has_key(servicespecial_link_patternsKey))
    {
        bourne::json value = object[servicespecial_link_patternsKey];




        ConfigNodePropertyArray* obj = &servicespecial_link_patterns;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["schedulerperiod"] = getSchedulerperiod().toJson();






	object["schedulerconcurrent"] = getSchedulerconcurrent().toJson();






	object["servicebad_link_tolerance_interval"] = getServicebadLinkToleranceInterval().toJson();






	object["servicecheck_override_patterns"] = getServicecheckOverridePatterns().toJson();






	object["servicecache_broken_internal_links"] = getServicecacheBrokenInternalLinks().toJson();






	object["servicespecial_link_prefix"] = getServicespecialLinkPrefix().toJson();






	object["servicespecial_link_patterns"] = getServicespecialLinkPatterns().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getSchedulerperiod()
{
	return schedulerperiod;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setSchedulerperiod(ConfigNodePropertyInteger schedulerperiod)
{
	this->schedulerperiod = schedulerperiod;
}

ConfigNodePropertyBoolean
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getSchedulerconcurrent()
{
	return schedulerconcurrent;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setSchedulerconcurrent(ConfigNodePropertyBoolean schedulerconcurrent)
{
	this->schedulerconcurrent = schedulerconcurrent;
}

ConfigNodePropertyInteger
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getServicebadLinkToleranceInterval()
{
	return servicebad_link_tolerance_interval;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setServicebadLinkToleranceInterval(ConfigNodePropertyInteger servicebad_link_tolerance_interval)
{
	this->servicebad_link_tolerance_interval = servicebad_link_tolerance_interval;
}

ConfigNodePropertyArray
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getServicecheckOverridePatterns()
{
	return servicecheck_override_patterns;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setServicecheckOverridePatterns(ConfigNodePropertyArray servicecheck_override_patterns)
{
	this->servicecheck_override_patterns = servicecheck_override_patterns;
}

ConfigNodePropertyBoolean
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getServicecacheBrokenInternalLinks()
{
	return servicecache_broken_internal_links;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setServicecacheBrokenInternalLinks(ConfigNodePropertyBoolean servicecache_broken_internal_links)
{
	this->servicecache_broken_internal_links = servicecache_broken_internal_links;
}

ConfigNodePropertyArray
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getServicespecialLinkPrefix()
{
	return servicespecial_link_prefix;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setServicespecialLinkPrefix(ConfigNodePropertyArray servicespecial_link_prefix)
{
	this->servicespecial_link_prefix = servicespecial_link_prefix;
}

ConfigNodePropertyArray
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::getServicespecialLinkPatterns()
{
	return servicespecial_link_patterns;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties::setServicespecialLinkPatterns(ConfigNodePropertyArray servicespecial_link_patterns)
{
	this->servicespecial_link_patterns = servicespecial_link_patterns;
}



