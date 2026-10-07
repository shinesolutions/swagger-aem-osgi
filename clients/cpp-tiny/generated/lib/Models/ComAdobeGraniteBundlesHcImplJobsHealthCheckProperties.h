
/*
 * ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties();
    ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getHctags();

	/*! \brief Set 
	 */
	void setHctags(ConfigNodePropertyArray hctags);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxqueuedjobs();

	/*! \brief Set 
	 */
	void setMaxqueuedjobs(ConfigNodePropertyInteger maxqueuedjobs);


    private:
    ConfigNodePropertyArray hctags;
    ConfigNodePropertyInteger maxqueuedjobs;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties_H_ */
