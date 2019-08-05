/*
 * OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo.h
 *
 * 
 */

#ifndef _OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo_H_
#define _OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo_H_


#include <string>
#include "OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.h"
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

class OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo();
	OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo();

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
	OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo_H_ */
