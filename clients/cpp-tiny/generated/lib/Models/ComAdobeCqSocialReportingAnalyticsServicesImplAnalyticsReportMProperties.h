
/*
 * ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties_H_


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

class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties();
    ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getReportfetchdelay();

	/*! \brief Set 
	 */
	void setReportfetchdelay(ConfigNodePropertyInteger reportfetchdelay);


    private:
    ConfigNodePropertyInteger reportfetchdelay;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties_H_ */
