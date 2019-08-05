/*
 * ComDayCqReplicationImplReverseReplicatorProperties.h
 *
 * 
 */

#ifndef _ComDayCqReplicationImplReverseReplicatorProperties_H_
#define _ComDayCqReplicationImplReverseReplicatorProperties_H_


#include <string>
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

class ComDayCqReplicationImplReverseReplicatorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqReplicationImplReverseReplicatorProperties();
	ComDayCqReplicationImplReverseReplicatorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqReplicationImplReverseReplicatorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSchedulerperiod();

	/*! \brief Set 
	 */
	void setSchedulerperiod(ConfigNodePropertyInteger  schedulerperiod);

private:
	ConfigNodePropertyInteger schedulerperiod;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqReplicationImplReverseReplicatorProperties_H_ */
