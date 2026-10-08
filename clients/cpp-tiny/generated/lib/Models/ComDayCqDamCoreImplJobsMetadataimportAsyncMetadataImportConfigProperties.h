
/*
 * ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties_H_


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

class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties();
    ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties();


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
	ConfigNodePropertyString getOperationIcon();

	/*! \brief Set 
	 */
	void setOperationIcon(ConfigNodePropertyString operationIcon);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTopicName();

	/*! \brief Set 
	 */
	void setTopicName(ConfigNodePropertyString topicName);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEmailEnabled();

	/*! \brief Set 
	 */
	void setEmailEnabled(ConfigNodePropertyBoolean emailEnabled);


    private:
    ConfigNodePropertyString operation;
    ConfigNodePropertyString operationIcon;
    ConfigNodePropertyString topicName;
    ConfigNodePropertyBoolean emailEnabled;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties_H_ */
