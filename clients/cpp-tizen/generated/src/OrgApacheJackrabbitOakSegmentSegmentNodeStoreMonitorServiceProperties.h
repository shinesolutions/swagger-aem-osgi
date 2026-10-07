/*
 * OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties_H_
#define _OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties();
	OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCommitsTrackerWriterGroups();

	/*! \brief Set 
	 */
	void setCommitsTrackerWriterGroups(ConfigNodePropertyArray  commitsTrackerWriterGroups);

private:
	ConfigNodePropertyArray commitsTrackerWriterGroups;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties_H_ */
