
/*
 * ComDayCqDamCoreImplReportsReportPurgeServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplReportsReportPurgeServiceProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplReportsReportPurgeServiceProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplReportsReportPurgeServiceProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplReportsReportPurgeServiceProperties();
    ComDayCqDamCoreImplReportsReportPurgeServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplReportsReportPurgeServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSchedulerexpression();

	/*! \brief Set 
	 */
	void setSchedulerexpression(ConfigNodePropertyString schedulerexpression);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxSavedReports();

	/*! \brief Set 
	 */
	void setMaxSavedReports(ConfigNodePropertyInteger maxSavedReports);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTimeDuration();

	/*! \brief Set 
	 */
	void setTimeDuration(ConfigNodePropertyInteger timeDuration);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnableReportPurge();

	/*! \brief Set 
	 */
	void setEnableReportPurge(ConfigNodePropertyBoolean enableReportPurge);


    private:
    ConfigNodePropertyString schedulerexpression;
    ConfigNodePropertyInteger maxSavedReports;
    ConfigNodePropertyInteger timeDuration;
    ConfigNodePropertyBoolean enableReportPurge;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplReportsReportPurgeServiceProperties_H_ */
