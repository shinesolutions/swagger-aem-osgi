
/*
 * ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties();
    ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getReportingservicesproxywhitelist();

	/*! \brief Set 
	 */
	void setReportingservicesproxywhitelist(ConfigNodePropertyArray reportingservicesproxywhitelist);


    private:
    ConfigNodePropertyArray reportingservicesproxywhitelist;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties_H_ */
