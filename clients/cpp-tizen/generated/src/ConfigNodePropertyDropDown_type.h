/*
 * ConfigNodePropertyDropDown_type.h
 *
 * 
 */

#ifndef _ConfigNodePropertyDropDown_type_H_
#define _ConfigNodePropertyDropDown_type_H_


#include <string>
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

class ConfigNodePropertyDropDown_type : public Object {
public:
	/*! \brief Constructor.
	 */
	ConfigNodePropertyDropDown_type();
	ConfigNodePropertyDropDown_type(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConfigNodePropertyDropDown_type();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Drop Down label
	 */
	std::string getLabels();

	/*! \brief Set Drop Down label
	 */
	void setLabels(std::string  labels);
	/*! \brief Get Drown Down value
	 */
	std::string getValues();

	/*! \brief Set Drown Down value
	 */
	void setValues(std::string  values);

private:
	std::string labels;
	std::string values;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConfigNodePropertyDropDown_type_H_ */
