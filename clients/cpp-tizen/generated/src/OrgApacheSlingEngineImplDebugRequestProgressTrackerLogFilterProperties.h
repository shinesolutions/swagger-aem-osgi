/*
 * OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties_H_
#define _OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties_H_


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

class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties();
	OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExtensions();

	/*! \brief Set 
	 */
	void setExtensions(ConfigNodePropertyArray  extensions);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMinDurationMs();

	/*! \brief Set 
	 */
	void setMinDurationMs(ConfigNodePropertyInteger  minDurationMs);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxDurationMs();

	/*! \brief Set 
	 */
	void setMaxDurationMs(ConfigNodePropertyInteger  maxDurationMs);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCompactLogFormat();

	/*! \brief Set 
	 */
	void setCompactLogFormat(ConfigNodePropertyBoolean  compactLogFormat);

private:
	ConfigNodePropertyArray extensions;
	ConfigNodePropertyInteger minDurationMs;
	ConfigNodePropertyInteger maxDurationMs;
	ConfigNodePropertyBoolean compactLogFormat;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties_H_ */
