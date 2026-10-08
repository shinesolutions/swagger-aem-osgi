
/*
 * ComAdobeGraniteWorkflowPurgeSchedulerInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteWorkflowPurgeSchedulerInfo_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteWorkflowPurgeSchedulerInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeGraniteWorkflowPurgeSchedulerProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteWorkflowPurgeSchedulerInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteWorkflowPurgeSchedulerInfo();
    ComAdobeGraniteWorkflowPurgeSchedulerInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteWorkflowPurgeSchedulerInfo();


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
	ComAdobeGraniteWorkflowPurgeSchedulerProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteWorkflowPurgeSchedulerProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeGraniteWorkflowPurgeSchedulerProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteWorkflowPurgeSchedulerInfo_H_ */
