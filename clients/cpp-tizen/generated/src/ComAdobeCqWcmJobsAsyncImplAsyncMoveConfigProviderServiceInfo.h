/*
 * ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo.h
 *
 * 
 */

#ifndef _ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo_H_
#define _ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo_H_


#include <string>
#include "ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.h"
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

class ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo();
	ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo();

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
	ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo_H_ */
