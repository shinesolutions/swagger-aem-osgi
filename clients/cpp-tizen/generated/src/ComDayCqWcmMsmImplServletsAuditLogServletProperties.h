/*
 * ComDayCqWcmMsmImplServletsAuditLogServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmMsmImplServletsAuditLogServletProperties_H_
#define _ComDayCqWcmMsmImplServletsAuditLogServletProperties_H_


#include <string>
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

class ComDayCqWcmMsmImplServletsAuditLogServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmMsmImplServletsAuditLogServletProperties();
	ComDayCqWcmMsmImplServletsAuditLogServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmMsmImplServletsAuditLogServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getAuditlogservletdefaulteventscount();

	/*! \brief Set 
	 */
	void setAuditlogservletdefaulteventscount(ConfigNodePropertyInteger  auditlogservletdefaulteventscount);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuditlogservletdefaultpath();

	/*! \brief Set 
	 */
	void setAuditlogservletdefaultpath(ConfigNodePropertyString  auditlogservletdefaultpath);

private:
	ConfigNodePropertyInteger auditlogservletdefaulteventscount;
	ConfigNodePropertyString auditlogservletdefaultpath;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmMsmImplServletsAuditLogServletProperties_H_ */
