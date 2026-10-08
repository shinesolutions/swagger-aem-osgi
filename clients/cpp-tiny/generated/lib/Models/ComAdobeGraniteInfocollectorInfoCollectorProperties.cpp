

#include "ComAdobeGraniteInfocollectorInfoCollectorProperties.h"

using namespace Tiny;

ComAdobeGraniteInfocollectorInfoCollectorProperties::ComAdobeGraniteInfocollectorInfoCollectorProperties()
{
	graniteinfocollectorincludeThreadDumps = ConfigNodePropertyBoolean();
	graniteinfocollectorincludeHeapDump = ConfigNodePropertyBoolean();
}

ComAdobeGraniteInfocollectorInfoCollectorProperties::ComAdobeGraniteInfocollectorInfoCollectorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteInfocollectorInfoCollectorProperties::~ComAdobeGraniteInfocollectorInfoCollectorProperties()
{

}

void
ComAdobeGraniteInfocollectorInfoCollectorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *graniteinfocollectorincludeThreadDumpsKey = "granite.infocollector.includeThreadDumps";

    if(object.has_key(graniteinfocollectorincludeThreadDumpsKey))
    {
        bourne::json value = object[graniteinfocollectorincludeThreadDumpsKey];




        ConfigNodePropertyBoolean* obj = &graniteinfocollectorincludeThreadDumps;
		obj->fromJson(value.dump());

    }

    const char *graniteinfocollectorincludeHeapDumpKey = "granite.infocollector.includeHeapDump";

    if(object.has_key(graniteinfocollectorincludeHeapDumpKey))
    {
        bourne::json value = object[graniteinfocollectorincludeHeapDumpKey];




        ConfigNodePropertyBoolean* obj = &graniteinfocollectorincludeHeapDump;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteInfocollectorInfoCollectorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["graniteinfocollectorincludeThreadDumps"] = getGraniteinfocollectorincludeThreadDumps().toJson();






	object["graniteinfocollectorincludeHeapDump"] = getGraniteinfocollectorincludeHeapDump().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteInfocollectorInfoCollectorProperties::getGraniteinfocollectorincludeThreadDumps()
{
	return graniteinfocollectorincludeThreadDumps;
}

void
ComAdobeGraniteInfocollectorInfoCollectorProperties::setGraniteinfocollectorincludeThreadDumps(ConfigNodePropertyBoolean graniteinfocollectorincludeThreadDumps)
{
	this->graniteinfocollectorincludeThreadDumps = graniteinfocollectorincludeThreadDumps;
}

ConfigNodePropertyBoolean
ComAdobeGraniteInfocollectorInfoCollectorProperties::getGraniteinfocollectorincludeHeapDump()
{
	return graniteinfocollectorincludeHeapDump;
}

void
ComAdobeGraniteInfocollectorInfoCollectorProperties::setGraniteinfocollectorincludeHeapDump(ConfigNodePropertyBoolean graniteinfocollectorincludeHeapDump)
{
	this->graniteinfocollectorincludeHeapDump = graniteinfocollectorincludeHeapDump;
}



