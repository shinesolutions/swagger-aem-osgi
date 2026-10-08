
/*
 * ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties();
    ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getNotifyonupdate();

	/*! \brief Set 
	 */
	void setNotifyonupdate(ConfigNodePropertyBoolean notifyonupdate);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getNotifyoncomplete();

	/*! \brief Set 
	 */
	void setNotifyoncomplete(ConfigNodePropertyBoolean notifyoncomplete);


    private:
    ConfigNodePropertyBoolean notifyonupdate;
    ConfigNodePropertyBoolean notifyoncomplete;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties_H_ */
