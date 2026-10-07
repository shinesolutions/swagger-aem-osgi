

#include "OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties.h"

using namespace Tiny;

OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties()
{
	hcname = ConfigNodePropertyString();
	hctags = ConfigNodePropertyArray();
	hcmbeanname = ConfigNodePropertyString();
	mbeanname = ConfigNodePropertyString();
	attributename = ConfigNodePropertyString();
	attributevalueconstraint = ConfigNodePropertyString();
}

OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::~OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties()
{

}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hcnameKey = "hc.name";

    if(object.has_key(hcnameKey))
    {
        bourne::json value = object[hcnameKey];




        ConfigNodePropertyString* obj = &hcname;
		obj->fromJson(value.dump());

    }

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }

    const char *hcmbeannameKey = "hc.mbean.name";

    if(object.has_key(hcmbeannameKey))
    {
        bourne::json value = object[hcmbeannameKey];




        ConfigNodePropertyString* obj = &hcmbeanname;
		obj->fromJson(value.dump());

    }

    const char *mbeannameKey = "mbean.name";

    if(object.has_key(mbeannameKey))
    {
        bourne::json value = object[mbeannameKey];




        ConfigNodePropertyString* obj = &mbeanname;
		obj->fromJson(value.dump());

    }

    const char *attributenameKey = "attribute.name";

    if(object.has_key(attributenameKey))
    {
        bourne::json value = object[attributenameKey];




        ConfigNodePropertyString* obj = &attributename;
		obj->fromJson(value.dump());

    }

    const char *attributevalueconstraintKey = "attribute.value.constraint";

    if(object.has_key(attributevalueconstraintKey))
    {
        bourne::json value = object[attributevalueconstraintKey];




        ConfigNodePropertyString* obj = &attributevalueconstraint;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hcname"] = getHcname().toJson();






	object["hctags"] = getHctags().toJson();






	object["hcmbeanname"] = getHcmbeanname().toJson();






	object["mbeanname"] = getMbeanname().toJson();






	object["attributename"] = getAttributename().toJson();






	object["attributevalueconstraint"] = getAttributevalueconstraint().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::getHcname()
{
	return hcname;
}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::setHcname(ConfigNodePropertyString hcname)
{
	this->hcname = hcname;
}

ConfigNodePropertyArray
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::getHctags()
{
	return hctags;
}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::getHcmbeanname()
{
	return hcmbeanname;
}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::setHcmbeanname(ConfigNodePropertyString hcmbeanname)
{
	this->hcmbeanname = hcmbeanname;
}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::getMbeanname()
{
	return mbeanname;
}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::setMbeanname(ConfigNodePropertyString mbeanname)
{
	this->mbeanname = mbeanname;
}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::getAttributename()
{
	return attributename;
}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::setAttributename(ConfigNodePropertyString attributename)
{
	this->attributename = attributename;
}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::getAttributevalueconstraint()
{
	return attributevalueconstraint;
}

void
OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties::setAttributevalueconstraint(ConfigNodePropertyString attributevalueconstraint)
{
	this->attributevalueconstraint = attributevalueconstraint;
}



