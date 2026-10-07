/*
 * ComDayCqReplicationImplReplicatorImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqReplicationImplReplicatorImplProperties_H_
#define _ComDayCqReplicationImplReplicatorImplProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqReplicationImplReplicatorImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqReplicationImplReplicatorImplProperties();
	ComDayCqReplicationImplReplicatorImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqReplicationImplReplicatorImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDistributeEvents();

	/*! \brief Set 
	 */
	void setDistributeEvents(ConfigNodePropertyBoolean  distribute_events);

private:
	ConfigNodePropertyBoolean distribute_events;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqReplicationImplReplicatorImplProperties_H_ */
