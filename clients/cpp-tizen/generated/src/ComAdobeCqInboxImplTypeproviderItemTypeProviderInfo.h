/*
 * ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo.h
 *
 * 
 */

#ifndef _ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo_H_
#define _ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo_H_


#include <string>
#include "ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.h"
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

class ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo();
	ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo();

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
	ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo_H_ */
