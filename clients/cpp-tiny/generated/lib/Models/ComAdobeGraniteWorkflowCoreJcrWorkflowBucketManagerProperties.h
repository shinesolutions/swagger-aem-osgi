
/*
 * ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties();
    ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getBucketSize();

	/*! \brief Set 
	 */
	void setBucketSize(ConfigNodePropertyInteger bucketSize);


    private:
    ConfigNodePropertyInteger bucketSize;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties_H_ */
