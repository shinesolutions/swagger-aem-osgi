/*
 * ComDayCqDamCoreImplServletHealthCheckServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplServletHealthCheckServletProperties_H_
#define _ComDayCqDamCoreImplServletHealthCheckServletProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqDamCoreImplServletHealthCheckServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplServletHealthCheckServletProperties();
	ComDayCqDamCoreImplServletHealthCheckServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplServletHealthCheckServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqdamsyncworkflowid();

	/*! \brief Set 
	 */
	void setCqdamsyncworkflowid(ConfigNodePropertyString  cqdamsyncworkflowid);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqdamsyncfoldertypes();

	/*! \brief Set 
	 */
	void setCqdamsyncfoldertypes(ConfigNodePropertyArray  cqdamsyncfoldertypes);

private:
	ConfigNodePropertyString cqdamsyncworkflowid;
	ConfigNodePropertyArray cqdamsyncfoldertypes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplServletHealthCheckServletProperties_H_ */
