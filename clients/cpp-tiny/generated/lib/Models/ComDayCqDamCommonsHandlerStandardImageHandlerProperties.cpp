

#include "ComDayCqDamCommonsHandlerStandardImageHandlerProperties.h"

using namespace Tiny;

ComDayCqDamCommonsHandlerStandardImageHandlerProperties::ComDayCqDamCommonsHandlerStandardImageHandlerProperties()
{
	large_file_threshold = ConfigNodePropertyInteger();
	large_comment_threshold = ConfigNodePropertyInteger();
	cqdamenableextmetaextraction = ConfigNodePropertyBoolean();
}

ComDayCqDamCommonsHandlerStandardImageHandlerProperties::ComDayCqDamCommonsHandlerStandardImageHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCommonsHandlerStandardImageHandlerProperties::~ComDayCqDamCommonsHandlerStandardImageHandlerProperties()
{

}

void
ComDayCqDamCommonsHandlerStandardImageHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *large_file_thresholdKey = "large_file_threshold";

    if(object.has_key(large_file_thresholdKey))
    {
        bourne::json value = object[large_file_thresholdKey];




        ConfigNodePropertyInteger* obj = &large_file_threshold;
		obj->fromJson(value.dump());

    }

    const char *large_comment_thresholdKey = "large_comment_threshold";

    if(object.has_key(large_comment_thresholdKey))
    {
        bourne::json value = object[large_comment_thresholdKey];




        ConfigNodePropertyInteger* obj = &large_comment_threshold;
		obj->fromJson(value.dump());

    }

    const char *cqdamenableextmetaextractionKey = "cq.dam.enable.ext.meta.extraction";

    if(object.has_key(cqdamenableextmetaextractionKey))
    {
        bourne::json value = object[cqdamenableextmetaextractionKey];




        ConfigNodePropertyBoolean* obj = &cqdamenableextmetaextraction;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCommonsHandlerStandardImageHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["large_file_threshold"] = getLargeFileThreshold().toJson();






	object["large_comment_threshold"] = getLargeCommentThreshold().toJson();






	object["cqdamenableextmetaextraction"] = getCqdamenableextmetaextraction().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqDamCommonsHandlerStandardImageHandlerProperties::getLargeFileThreshold()
{
	return large_file_threshold;
}

void
ComDayCqDamCommonsHandlerStandardImageHandlerProperties::setLargeFileThreshold(ConfigNodePropertyInteger large_file_threshold)
{
	this->large_file_threshold = large_file_threshold;
}

ConfigNodePropertyInteger
ComDayCqDamCommonsHandlerStandardImageHandlerProperties::getLargeCommentThreshold()
{
	return large_comment_threshold;
}

void
ComDayCqDamCommonsHandlerStandardImageHandlerProperties::setLargeCommentThreshold(ConfigNodePropertyInteger large_comment_threshold)
{
	this->large_comment_threshold = large_comment_threshold;
}

ConfigNodePropertyBoolean
ComDayCqDamCommonsHandlerStandardImageHandlerProperties::getCqdamenableextmetaextraction()
{
	return cqdamenableextmetaextraction;
}

void
ComDayCqDamCommonsHandlerStandardImageHandlerProperties::setCqdamenableextmetaextraction(ConfigNodePropertyBoolean cqdamenableextmetaextraction)
{
	this->cqdamenableextmetaextraction = cqdamenableextmetaextraction;
}



