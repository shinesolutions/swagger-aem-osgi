

#include "ComDayCqDamCoreImplHandlerJpegHandlerProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplHandlerJpegHandlerProperties::ComDayCqDamCoreImplHandlerJpegHandlerProperties()
{
	cqdamenableextmetaextraction = ConfigNodePropertyBoolean();
	large_file_threshold = ConfigNodePropertyInteger();
	large_comment_threshold = ConfigNodePropertyInteger();
}

ComDayCqDamCoreImplHandlerJpegHandlerProperties::ComDayCqDamCoreImplHandlerJpegHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplHandlerJpegHandlerProperties::~ComDayCqDamCoreImplHandlerJpegHandlerProperties()
{

}

void
ComDayCqDamCoreImplHandlerJpegHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdamenableextmetaextractionKey = "cq.dam.enable.ext.meta.extraction";

    if(object.has_key(cqdamenableextmetaextractionKey))
    {
        bourne::json value = object[cqdamenableextmetaextractionKey];




        ConfigNodePropertyBoolean* obj = &cqdamenableextmetaextraction;
		obj->fromJson(value.dump());

    }

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


}

bourne::json
ComDayCqDamCoreImplHandlerJpegHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdamenableextmetaextraction"] = getCqdamenableextmetaextraction().toJson();






	object["large_file_threshold"] = getLargeFileThreshold().toJson();






	object["large_comment_threshold"] = getLargeCommentThreshold().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplHandlerJpegHandlerProperties::getCqdamenableextmetaextraction()
{
	return cqdamenableextmetaextraction;
}

void
ComDayCqDamCoreImplHandlerJpegHandlerProperties::setCqdamenableextmetaextraction(ConfigNodePropertyBoolean cqdamenableextmetaextraction)
{
	this->cqdamenableextmetaextraction = cqdamenableextmetaextraction;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplHandlerJpegHandlerProperties::getLargeFileThreshold()
{
	return large_file_threshold;
}

void
ComDayCqDamCoreImplHandlerJpegHandlerProperties::setLargeFileThreshold(ConfigNodePropertyInteger large_file_threshold)
{
	this->large_file_threshold = large_file_threshold;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplHandlerJpegHandlerProperties::getLargeCommentThreshold()
{
	return large_comment_threshold;
}

void
ComDayCqDamCoreImplHandlerJpegHandlerProperties::setLargeCommentThreshold(ConfigNodePropertyInteger large_comment_threshold)
{
	this->large_comment_threshold = large_comment_threshold;
}



