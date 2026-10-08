

#include "ComAdobeCqHcContentPackagesHealthCheckProperties.h"

using namespace Tiny;

ComAdobeCqHcContentPackagesHealthCheckProperties::ComAdobeCqHcContentPackagesHealthCheckProperties()
{
	hcname = ConfigNodePropertyString();
	hctags = ConfigNodePropertyArray();
	hcmbeanname = ConfigNodePropertyString();
	packagenames = ConfigNodePropertyArray();
}

ComAdobeCqHcContentPackagesHealthCheckProperties::ComAdobeCqHcContentPackagesHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqHcContentPackagesHealthCheckProperties::~ComAdobeCqHcContentPackagesHealthCheckProperties()
{

}

void
ComAdobeCqHcContentPackagesHealthCheckProperties::fromJson(std::string jsonObj)
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

    const char *packagenamesKey = "package.names";

    if(object.has_key(packagenamesKey))
    {
        bourne::json value = object[packagenamesKey];




        ConfigNodePropertyArray* obj = &packagenames;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqHcContentPackagesHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hcname"] = getHcname().toJson();






	object["hctags"] = getHctags().toJson();






	object["hcmbeanname"] = getHcmbeanname().toJson();






	object["packagenames"] = getPackagenames().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqHcContentPackagesHealthCheckProperties::getHcname()
{
	return hcname;
}

void
ComAdobeCqHcContentPackagesHealthCheckProperties::setHcname(ConfigNodePropertyString hcname)
{
	this->hcname = hcname;
}

ConfigNodePropertyArray
ComAdobeCqHcContentPackagesHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeCqHcContentPackagesHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyString
ComAdobeCqHcContentPackagesHealthCheckProperties::getHcmbeanname()
{
	return hcmbeanname;
}

void
ComAdobeCqHcContentPackagesHealthCheckProperties::setHcmbeanname(ConfigNodePropertyString hcmbeanname)
{
	this->hcmbeanname = hcmbeanname;
}

ConfigNodePropertyArray
ComAdobeCqHcContentPackagesHealthCheckProperties::getPackagenames()
{
	return packagenames;
}

void
ComAdobeCqHcContentPackagesHealthCheckProperties::setPackagenames(ConfigNodePropertyArray packagenames)
{
	this->packagenames = packagenames;
}



