/*
 * ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo.h
 *
 * 
 */

#ifndef _ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo_H_
#define _ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo_H_


#include <string>
#include "ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties.h"
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

class ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo();
	ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo();

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
	ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo_H_ */
