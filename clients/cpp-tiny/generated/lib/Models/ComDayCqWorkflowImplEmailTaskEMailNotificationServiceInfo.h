
/*
 * ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo_H_
#define TINY_CPP_CLIENT_ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo();
    ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get 
	 */
	ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo_H_ */
