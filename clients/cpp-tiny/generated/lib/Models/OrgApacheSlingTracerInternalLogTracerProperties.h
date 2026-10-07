
/*
 * OrgApacheSlingTracerInternalLogTracerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingTracerInternalLogTracerProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingTracerInternalLogTracerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingTracerInternalLogTracerProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingTracerInternalLogTracerProperties();
    OrgApacheSlingTracerInternalLogTracerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingTracerInternalLogTracerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTracerSets();

	/*! \brief Set 
	 */
	void setTracerSets(ConfigNodePropertyArray tracerSets);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getServletEnabled();

	/*! \brief Set 
	 */
	void setServletEnabled(ConfigNodePropertyBoolean servletEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRecordingCacheSizeInMB();

	/*! \brief Set 
	 */
	void setRecordingCacheSizeInMB(ConfigNodePropertyInteger recordingCacheSizeInMB);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRecordingCacheDurationInSecs();

	/*! \brief Set 
	 */
	void setRecordingCacheDurationInSecs(ConfigNodePropertyInteger recordingCacheDurationInSecs);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRecordingCompressionEnabled();

	/*! \brief Set 
	 */
	void setRecordingCompressionEnabled(ConfigNodePropertyBoolean recordingCompressionEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGzipResponse();

	/*! \brief Set 
	 */
	void setGzipResponse(ConfigNodePropertyBoolean gzipResponse);


    private:
    ConfigNodePropertyArray tracerSets;
    ConfigNodePropertyBoolean enabled;
    ConfigNodePropertyBoolean servletEnabled;
    ConfigNodePropertyInteger recordingCacheSizeInMB;
    ConfigNodePropertyInteger recordingCacheDurationInSecs;
    ConfigNodePropertyBoolean recordingCompressionEnabled;
    ConfigNodePropertyBoolean gzipResponse;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingTracerInternalLogTracerProperties_H_ */
