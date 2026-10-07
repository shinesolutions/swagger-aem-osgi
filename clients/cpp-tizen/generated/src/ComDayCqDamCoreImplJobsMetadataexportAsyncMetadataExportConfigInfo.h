/*
 * ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo.h
 *
 * 
 */

#ifndef _ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo_H_
#define _ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo_H_


#include <string>
#include "ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties.h"
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

class ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo();
	ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string  pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo_H_ */
