/*
 * ConfigNodePropertyDropDown.h
 *
 * 
 */

#ifndef _ConfigNodePropertyDropDown_H_
#define _ConfigNodePropertyDropDown_H_


#include <string>
#include "ConfigNodePropertyDropDown_type.h"
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

class ConfigNodePropertyDropDown : public Object {
public:
	/*! \brief Constructor.
	 */
	ConfigNodePropertyDropDown();
	ConfigNodePropertyDropDown(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConfigNodePropertyDropDown();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get property name
	 */
	std::string getName();

	/*! \brief Set property name
	 */
	void setName(std::string  name);
	/*! \brief Get True if optional
	 */
	bool getOptional();

	/*! \brief Set True if optional
	 */
	void setOptional(bool  optional);
	/*! \brief Get True if property is set
	 */
	bool getIsSet();

	/*! \brief Set True if property is set
	 */
	void setIsSet(bool  is_set);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown_type getType();

	/*! \brief Set 
	 */
	void setType(ConfigNodePropertyDropDown_type  type);
	/*! \brief Get Property value
	 */
	std::string getValue();

	/*! \brief Set Property value
	 */
	void setValue(std::string  value);
	/*! \brief Get Property description
	 */
	std::string getDescription();

	/*! \brief Set Property description
	 */
	void setDescription(std::string  description);

private:
	std::string name;
	bool optional;
	bool is_set;
	ConfigNodePropertyDropDown_type type;
	std::string value;
	std::string description;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConfigNodePropertyDropDown_H_ */
