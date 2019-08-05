/*
 * ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo.h
 *
 * 
 */

#ifndef _ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo_H_
#define _ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo_H_


#include <string>
#include "ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.h"
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

class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo();
	ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo();

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
	ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo_H_ */
