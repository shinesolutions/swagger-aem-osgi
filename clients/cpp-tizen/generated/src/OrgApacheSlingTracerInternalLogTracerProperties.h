/*
 * OrgApacheSlingTracerInternalLogTracerProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingTracerInternalLogTracerProperties_H_
#define _OrgApacheSlingTracerInternalLogTracerProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingTracerInternalLogTracerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingTracerInternalLogTracerProperties();
	OrgApacheSlingTracerInternalLogTracerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingTracerInternalLogTracerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTracerSets();

	/*! \brief Set 
	 */
	void setTracerSets(ConfigNodePropertyArray  tracerSets);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean  enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getServletEnabled();

	/*! \brief Set 
	 */
	void setServletEnabled(ConfigNodePropertyBoolean  servletEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRecordingCacheSizeInMB();

	/*! \brief Set 
	 */
	void setRecordingCacheSizeInMB(ConfigNodePropertyInteger  recordingCacheSizeInMB);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRecordingCacheDurationInSecs();

	/*! \brief Set 
	 */
	void setRecordingCacheDurationInSecs(ConfigNodePropertyInteger  recordingCacheDurationInSecs);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRecordingCompressionEnabled();

	/*! \brief Set 
	 */
	void setRecordingCompressionEnabled(ConfigNodePropertyBoolean  recordingCompressionEnabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGzipResponse();

	/*! \brief Set 
	 */
	void setGzipResponse(ConfigNodePropertyBoolean  gzipResponse);

private:
	ConfigNodePropertyArray tracerSets;
	ConfigNodePropertyBoolean enabled;
	ConfigNodePropertyBoolean servletEnabled;
	ConfigNodePropertyInteger recordingCacheSizeInMB;
	ConfigNodePropertyInteger recordingCacheDurationInSecs;
	ConfigNodePropertyBoolean recordingCompressionEnabled;
	ConfigNodePropertyBoolean gzipResponse;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingTracerInternalLogTracerProperties_H_ */
