
/*
 * OrgApacheFelixEventadminImplEventAdminProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheFelixEventadminImplEventAdminProperties_H_
#define TINY_CPP_CLIENT_OrgApacheFelixEventadminImplEventAdminProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyFloat.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheFelixEventadminImplEventAdminProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheFelixEventadminImplEventAdminProperties();
    OrgApacheFelixEventadminImplEventAdminProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheFelixEventadminImplEventAdminProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapachefelixeventadminThreadPoolSize();

	/*! \brief Set 
	 */
	void setOrgapachefelixeventadminThreadPoolSize(ConfigNodePropertyInteger orgapachefelixeventadminThreadPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyFloat getOrgapachefelixeventadminAsyncToSyncThreadRatio();

	/*! \brief Set 
	 */
	void setOrgapachefelixeventadminAsyncToSyncThreadRatio(ConfigNodePropertyFloat orgapachefelixeventadminAsyncToSyncThreadRatio);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOrgapachefelixeventadminTimeout();

	/*! \brief Set 
	 */
	void setOrgapachefelixeventadminTimeout(ConfigNodePropertyInteger orgapachefelixeventadminTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOrgapachefelixeventadminRequireTopic();

	/*! \brief Set 
	 */
	void setOrgapachefelixeventadminRequireTopic(ConfigNodePropertyBoolean orgapachefelixeventadminRequireTopic);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapachefelixeventadminIgnoreTimeout();

	/*! \brief Set 
	 */
	void setOrgapachefelixeventadminIgnoreTimeout(ConfigNodePropertyArray orgapachefelixeventadminIgnoreTimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOrgapachefelixeventadminIgnoreTopic();

	/*! \brief Set 
	 */
	void setOrgapachefelixeventadminIgnoreTopic(ConfigNodePropertyArray orgapachefelixeventadminIgnoreTopic);


    private:
    ConfigNodePropertyInteger orgapachefelixeventadminThreadPoolSize;
    ConfigNodePropertyFloat orgapachefelixeventadminAsyncToSyncThreadRatio;
    ConfigNodePropertyInteger orgapachefelixeventadminTimeout;
    ConfigNodePropertyBoolean orgapachefelixeventadminRequireTopic;
    ConfigNodePropertyArray orgapachefelixeventadminIgnoreTimeout;
    ConfigNodePropertyArray orgapachefelixeventadminIgnoreTopic;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheFelixEventadminImplEventAdminProperties_H_ */
