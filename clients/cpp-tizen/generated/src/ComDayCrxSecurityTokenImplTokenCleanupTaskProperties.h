/*
 * ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.h
 *
 * 
 */

#ifndef _ComDayCrxSecurityTokenImplTokenCleanupTaskProperties_H_
#define _ComDayCrxSecurityTokenImplTokenCleanupTaskProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"
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

class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCrxSecurityTokenImplTokenCleanupTaskProperties();
	ComDayCrxSecurityTokenImplTokenCleanupTaskProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCrxSecurityTokenImplTokenCleanupTaskProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabletokencleanuptask();

	/*! \brief Set 
	 */
	void setEnabletokencleanuptask(ConfigNodePropertyBoolean  enabletokencleanuptask);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulerexpression();

	/*! \brief Set 
	 */
	void setSchedulerexpression(ConfigNodePropertyString  schedulerexpression);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getBatchsize();

	/*! \brief Set 
	 */
	void setBatchsize(ConfigNodePropertyInteger  batchsize);

private:
	ConfigNodePropertyBoolean enabletokencleanuptask;
	ConfigNodePropertyString schedulerexpression;
	ConfigNodePropertyInteger batchsize;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCrxSecurityTokenImplTokenCleanupTaskProperties_H_ */
