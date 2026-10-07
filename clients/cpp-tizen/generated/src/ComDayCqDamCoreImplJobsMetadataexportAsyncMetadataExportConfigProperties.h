/*
 * ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties_H_
#define _ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties_H_


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

class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties();
	ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties();

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
	ConfigNodePropertyBoolean getEmailEnabled();

	/*! \brief Set 
	 */
	void setEmailEnabled(ConfigNodePropertyBoolean  emailEnabled);

private:
	ConfigNodePropertyString operation;
	ConfigNodePropertyBoolean emailEnabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties_H_ */
