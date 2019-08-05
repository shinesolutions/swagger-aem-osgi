/*
 * ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties_H_
#define _ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties();
	ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOperation();

	/*! \brief Set 
	 */
	void setOperation(ConfigNodePropertyString  operation);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOperationIcon();

	/*! \brief Set 
	 */
	void setOperationIcon(ConfigNodePropertyString  operationIcon);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTopicName();

	/*! \brief Set 
	 */
	void setTopicName(ConfigNodePropertyString  topicName);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEmailEnabled();

	/*! \brief Set 
	 */
	void setEmailEnabled(ConfigNodePropertyBoolean  emailEnabled);

private:
	ConfigNodePropertyString operation;
	ConfigNodePropertyString operationIcon;
	ConfigNodePropertyString topicName;
	ConfigNodePropertyBoolean emailEnabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties_H_ */
