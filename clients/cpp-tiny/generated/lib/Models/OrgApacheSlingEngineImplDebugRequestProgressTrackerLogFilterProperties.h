
/*
 * OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties_H_


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

class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties();
    OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExtensions();

	/*! \brief Set 
	 */
	void setExtensions(ConfigNodePropertyArray extensions);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMinDurationMs();

	/*! \brief Set 
	 */
	void setMinDurationMs(ConfigNodePropertyInteger minDurationMs);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxDurationMs();

	/*! \brief Set 
	 */
	void setMaxDurationMs(ConfigNodePropertyInteger maxDurationMs);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCompactLogFormat();

	/*! \brief Set 
	 */
	void setCompactLogFormat(ConfigNodePropertyBoolean compactLogFormat);


    private:
    ConfigNodePropertyArray extensions;
    ConfigNodePropertyInteger minDurationMs;
    ConfigNodePropertyInteger maxDurationMs;
    ConfigNodePropertyBoolean compactLogFormat;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties_H_ */
