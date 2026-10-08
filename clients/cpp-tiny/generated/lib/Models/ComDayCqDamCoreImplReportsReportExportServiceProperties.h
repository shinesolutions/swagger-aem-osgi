
/*
 * ComDayCqDamCoreImplReportsReportExportServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplReportsReportExportServiceProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplReportsReportExportServiceProperties_H_


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

class ComDayCqDamCoreImplReportsReportExportServiceProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplReportsReportExportServiceProperties();
    ComDayCqDamCoreImplReportsReportExportServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplReportsReportExportServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getQueryBatchSize();

	/*! \brief Set 
	 */
	void setQueryBatchSize(ConfigNodePropertyInteger queryBatchSize);


    private:
    ConfigNodePropertyInteger queryBatchSize;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplReportsReportExportServiceProperties_H_ */
