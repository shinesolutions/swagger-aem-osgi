

#include "ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties.h"

using namespace Tiny;

ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties()
{
	schedulerexpression = ConfigNodePropertyString();
	jmxobjectname = ConfigNodePropertyString();
}

ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::~ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties()
{

}

void
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *schedulerexpressionKey = "scheduler.expression";

    if(object.has_key(schedulerexpressionKey))
    {
        bourne::json value = object[schedulerexpressionKey];




        ConfigNodePropertyString* obj = &schedulerexpression;
		obj->fromJson(value.dump());

    }

    const char *jmxobjectnameKey = "jmx.objectname";

    if(object.has_key(jmxobjectnameKey))
    {
        bourne::json value = object[jmxobjectnameKey];




        ConfigNodePropertyString* obj = &jmxobjectname;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["schedulerexpression"] = getSchedulerexpression().toJson();






	object["jmxobjectname"] = getJmxobjectname().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::setSchedulerexpression(ConfigNodePropertyString schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}

ConfigNodePropertyString
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::getJmxobjectname()
{
	return jmxobjectname;
}

void
ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties::setJmxobjectname(ConfigNodePropertyString jmxobjectname)
{
	this->jmxobjectname = jmxobjectname;
}



