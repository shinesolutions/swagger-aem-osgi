/*
 * OrgApacheFelixEventadminImplEventAdminProperties.h
 *
 * 
 */

#ifndef _OrgApacheFelixEventadminImplEventAdminProperties_H_
#define _OrgApacheFelixEventadminImplEventAdminProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyFloat.h"
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

class OrgApacheFelixEventadminImplEventAdminProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheFelixEventadminImplEventAdminProperties();
	OrgApacheFelixEventadminImplEventAdminProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheFelixEventadminImplEventAdminProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapachefelixeventadminThreadPoolSize();

	/*! \brief Set 
	 */
	void setOrgapachefelixeventadminThreadPoolSize(ConfigNodePropertyInteger  orgapachefelixeventadminThreadPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyFloat getOrgapachefelixeventadminAsyncToSyncThreadRatio();

	/*! \brief Set 
	 */
	void setOrgapachefelixeventadminAsyncToSyncThreadRatio(ConfigNodePropertyFloat  orgapachefelixeventadminAsyncToSyncThreadRatio);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapachefelixeventadminTimeout();

	/*! \brief Set 
	 */
	void setOrgapachefelixeventadminTimeout(ConfigNodePropertyInteger  orgapachefelixeventadminTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapachefelixeventadminRequireTopic();

	/*! \brief Set 
	 */
	void setOrgapachefelixeventadminRequireTopic(ConfigNodePropertyBoolean  orgapachefelixeventadminRequireTopic);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapachefelixeventadminIgnoreTimeout();

	/*! \brief Set 
	 */
	void setOrgapachefelixeventadminIgnoreTimeout(ConfigNodePropertyArray  orgapachefelixeventadminIgnoreTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapachefelixeventadminIgnoreTopic();

	/*! \brief Set 
	 */
	void setOrgapachefelixeventadminIgnoreTopic(ConfigNodePropertyArray  orgapachefelixeventadminIgnoreTopic);

private:
	ConfigNodePropertyInteger orgapachefelixeventadminThreadPoolSize;
	ConfigNodePropertyFloat orgapachefelixeventadminAsyncToSyncThreadRatio;
	ConfigNodePropertyInteger orgapachefelixeventadminTimeout;
	ConfigNodePropertyBoolean orgapachefelixeventadminRequireTopic;
	ConfigNodePropertyArray orgapachefelixeventadminIgnoreTimeout;
	ConfigNodePropertyArray orgapachefelixeventadminIgnoreTopic;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheFelixEventadminImplEventAdminProperties_H_ */
