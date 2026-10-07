
/*
 * ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWorkflowImplEmailEMailNotificationServiceProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWorkflowImplEmailEMailNotificationServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWorkflowImplEmailEMailNotificationServiceProperties();
    ComDayCqWorkflowImplEmailEMailNotificationServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWorkflowImplEmailEMailNotificationServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getFromaddress();

	/*! \brief Set 
	 */
	void setFromaddress(ConfigNodePropertyString fromaddress);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getHostprefix();

	/*! \brief Set 
	 */
	void setHostprefix(ConfigNodePropertyString hostprefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getNotifyonabort();

	/*! \brief Set 
	 */
	void setNotifyonabort(ConfigNodePropertyBoolean notifyonabort);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getNotifyoncomplete();

	/*! \brief Set 
	 */
	void setNotifyoncomplete(ConfigNodePropertyBoolean notifyoncomplete);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getNotifyoncontainercomplete();

	/*! \brief Set 
	 */
	void setNotifyoncontainercomplete(ConfigNodePropertyBoolean notifyoncontainercomplete);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getNotifyuseronly();

	/*! \brief Set 
	 */
	void setNotifyuseronly(ConfigNodePropertyBoolean notifyuseronly);


    private:
    ConfigNodePropertyString fromaddress;
    ConfigNodePropertyString hostprefix;
    ConfigNodePropertyBoolean notifyonabort;
    ConfigNodePropertyBoolean notifyoncomplete;
    ConfigNodePropertyBoolean notifyoncontainercomplete;
    ConfigNodePropertyBoolean notifyuseronly;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWorkflowImplEmailEMailNotificationServiceProperties_H_ */
