
/*
 * ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties();
    ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOperation();

	/*! \brief Set 
	 */
	void setOperation(ConfigNodePropertyString operation);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEmailEnabled();

	/*! \brief Set 
	 */
	void setEmailEnabled(ConfigNodePropertyBoolean emailEnabled);


    private:
    ConfigNodePropertyString operation;
    ConfigNodePropertyBoolean emailEnabled;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties_H_ */
