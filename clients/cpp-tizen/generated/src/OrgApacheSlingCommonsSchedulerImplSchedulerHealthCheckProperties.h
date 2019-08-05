/*
 * OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties_H_
#define _OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties_H_


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

class OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties();
	OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxquartzJobdurationacceptable();

	/*! \brief Set 
	 */
	void setMaxquartzJobdurationacceptable(ConfigNodePropertyInteger  maxquartzJobdurationacceptable);

private:
	ConfigNodePropertyInteger maxquartzJobdurationacceptable;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties_H_ */
