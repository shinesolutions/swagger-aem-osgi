/*
 * ComDayCqDamCoreImplEventDamEventAuditListenerProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplEventDamEventAuditListenerProperties_H_
#define _ComDayCqDamCoreImplEventDamEventAuditListenerProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqDamCoreImplEventDamEventAuditListenerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplEventDamEventAuditListenerProperties();
	ComDayCqDamCoreImplEventDamEventAuditListenerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplEventDamEventAuditListenerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventfilter();

	/*! \brief Set 
	 */
	void setEventfilter(ConfigNodePropertyString  eventfilter);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean  enabled);

private:
	ConfigNodePropertyString eventfilter;
	ConfigNodePropertyBoolean enabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplEventDamEventAuditListenerProperties_H_ */
