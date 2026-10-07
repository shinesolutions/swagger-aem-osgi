
/*
 * OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties();
    OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCommitsTrackerWriterGroups();

	/*! \brief Set 
	 */
	void setCommitsTrackerWriterGroups(ConfigNodePropertyArray commitsTrackerWriterGroups);


    private:
    ConfigNodePropertyArray commitsTrackerWriterGroups;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties_H_ */
