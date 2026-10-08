
/*
 * ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties_H_


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

class ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties();
    ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqsocialreportinganalyticspollingimporterinterval();

	/*! \brief Set 
	 */
	void setCqsocialreportinganalyticspollingimporterinterval(ConfigNodePropertyInteger cqsocialreportinganalyticspollingimporterinterval);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqsocialreportinganalyticspollingimporterpageSize();

	/*! \brief Set 
	 */
	void setCqsocialreportinganalyticspollingimporterpageSize(ConfigNodePropertyInteger cqsocialreportinganalyticspollingimporterpageSize);


    private:
    ConfigNodePropertyInteger cqsocialreportinganalyticspollingimporterinterval;
    ConfigNodePropertyInteger cqsocialreportinganalyticspollingimporterpageSize;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties_H_ */
