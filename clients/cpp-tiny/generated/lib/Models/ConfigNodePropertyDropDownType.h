
/*
 * ConfigNodePropertyDropDown_type.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ConfigNodePropertyDropDown_type_H_
#define TINY_CPP_CLIENT_ConfigNodePropertyDropDown_type_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ConfigNodePropertyDropDown_type{
public:

    /*! \brief Constructor.
	 */
    ConfigNodePropertyDropDown_type();
    ConfigNodePropertyDropDown_type(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConfigNodePropertyDropDown_type();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Drop Down label
	 */
	AnyType getLabels();

	/*! \brief Set Drop Down label
	 */
	void setLabels(AnyType labels);
	/*! \brief Get Drown Down value
	 */
	AnyType getValues();

	/*! \brief Set Drown Down value
	 */
	void setValues(AnyType values);


    private:
    AnyType labels;
    AnyType values;
};
}

#endif /* TINY_CPP_CLIENT_ConfigNodePropertyDropDown_type_H_ */
