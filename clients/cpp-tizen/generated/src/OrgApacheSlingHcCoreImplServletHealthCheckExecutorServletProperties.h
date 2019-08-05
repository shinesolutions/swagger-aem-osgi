/*
 * OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties_H_
#define _OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties_H_


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

class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties();
	OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getServletPath();

	/*! \brief Set 
	 */
	void setServletPath(ConfigNodePropertyString  servletPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDisabled();

	/*! \brief Set 
	 */
	void setDisabled(ConfigNodePropertyBoolean  disabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCorsaccessControlAllowOrigin();

	/*! \brief Set 
	 */
	void setCorsaccessControlAllowOrigin(ConfigNodePropertyString  corsaccessControlAllowOrigin);

private:
	ConfigNodePropertyString servletPath;
	ConfigNodePropertyBoolean disabled;
	ConfigNodePropertyString corsaccessControlAllowOrigin;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties_H_ */
