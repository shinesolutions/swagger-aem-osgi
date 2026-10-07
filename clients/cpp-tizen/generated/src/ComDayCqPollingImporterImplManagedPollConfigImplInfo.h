/*
 * ComDayCqPollingImporterImplManagedPollConfigImplInfo.h
 *
 * 
 */

#ifndef _ComDayCqPollingImporterImplManagedPollConfigImplInfo_H_
#define _ComDayCqPollingImporterImplManagedPollConfigImplInfo_H_


#include <string>
#include "ComDayCqPollingImporterImplManagedPollConfigImplProperties.h"
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

class ComDayCqPollingImporterImplManagedPollConfigImplInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqPollingImporterImplManagedPollConfigImplInfo();
	ComDayCqPollingImporterImplManagedPollConfigImplInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqPollingImporterImplManagedPollConfigImplInfo();

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
	ComDayCqPollingImporterImplManagedPollConfigImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqPollingImporterImplManagedPollConfigImplProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqPollingImporterImplManagedPollConfigImplProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqPollingImporterImplManagedPollConfigImplInfo_H_ */
