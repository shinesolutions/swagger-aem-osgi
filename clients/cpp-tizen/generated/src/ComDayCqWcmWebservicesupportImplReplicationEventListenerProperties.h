/*
 * ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties_H_
#define _ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties_H_


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

class ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties();
	ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties();

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

#endif /* _ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties_H_ */
