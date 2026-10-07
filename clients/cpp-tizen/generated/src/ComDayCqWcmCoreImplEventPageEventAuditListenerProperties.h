/*
 * ComDayCqWcmCoreImplEventPageEventAuditListenerProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplEventPageEventAuditListenerProperties_H_
#define _ComDayCqWcmCoreImplEventPageEventAuditListenerProperties_H_


#include <string>
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

class ComDayCqWcmCoreImplEventPageEventAuditListenerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplEventPageEventAuditListenerProperties();
	ComDayCqWcmCoreImplEventPageEventAuditListenerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplEventPageEventAuditListenerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getConfigured();

	/*! \brief Set 
	 */
	void setConfigured(ConfigNodePropertyString  configured);

private:
	ConfigNodePropertyString configured;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplEventPageEventAuditListenerProperties_H_ */
