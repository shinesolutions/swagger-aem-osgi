

#include "ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.h"

using namespace Tiny;

ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties()
{
	aggregaterelationships = ConfigNodePropertyArray();
	aggregatedescendvirtual = ConfigNodePropertyBoolean();
}

ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::~ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties()
{

}

void
ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *aggregaterelationshipsKey = "aggregate.relationships";

    if(object.has_key(aggregaterelationshipsKey))
    {
        bourne::json value = object[aggregaterelationshipsKey];




        ConfigNodePropertyArray* obj = &aggregaterelationships;
		obj->fromJson(value.dump());

    }

    const char *aggregatedescendvirtualKey = "aggregate.descend.virtual";

    if(object.has_key(aggregatedescendvirtualKey))
    {
        bourne::json value = object[aggregatedescendvirtualKey];




        ConfigNodePropertyBoolean* obj = &aggregatedescendvirtual;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["aggregaterelationships"] = getAggregaterelationships().toJson();






	object["aggregatedescendvirtual"] = getAggregatedescendvirtual().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::getAggregaterelationships()
{
	return aggregaterelationships;
}

void
ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::setAggregaterelationships(ConfigNodePropertyArray aggregaterelationships)
{
	this->aggregaterelationships = aggregaterelationships;
}

ConfigNodePropertyBoolean
ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::getAggregatedescendvirtual()
{
	return aggregatedescendvirtual;
}

void
ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties::setAggregatedescendvirtual(ConfigNodePropertyBoolean aggregatedescendvirtual)
{
	this->aggregatedescendvirtual = aggregatedescendvirtual;
}



