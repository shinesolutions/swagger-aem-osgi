/*
 * ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties_H_
#define _ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties_H_


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

class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties();
	ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFlushagents();

	/*! \brief Set 
	 */
	void setFlushagents(ConfigNodePropertyArray  flushagents);

private:
	ConfigNodePropertyArray flushagents;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties_H_ */
