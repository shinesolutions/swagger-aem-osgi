
/*
 * ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo();
    ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo();


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
	ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo_H_ */
