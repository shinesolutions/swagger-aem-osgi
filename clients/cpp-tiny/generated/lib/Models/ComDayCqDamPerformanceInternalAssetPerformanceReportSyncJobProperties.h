
/*
 * ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties();
    ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties();


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


    private:
    ConfigNodePropertyString schedulerexpression;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties_H_ */
