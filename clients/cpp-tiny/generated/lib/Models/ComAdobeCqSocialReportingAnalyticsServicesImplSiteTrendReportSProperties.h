
/*
 * ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties_H_


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

class ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties();
    ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqsocialconsoleanalyticssitesmapping();

	/*! \brief Set 
	 */
	void setCqsocialconsoleanalyticssitesmapping(ConfigNodePropertyArray cqsocialconsoleanalyticssitesmapping);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPriority();

	/*! \brief Set 
	 */
	void setPriority(ConfigNodePropertyInteger priority);


    private:
    ConfigNodePropertyArray cqsocialconsoleanalyticssitesmapping;
    ConfigNodePropertyInteger priority;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties_H_ */
