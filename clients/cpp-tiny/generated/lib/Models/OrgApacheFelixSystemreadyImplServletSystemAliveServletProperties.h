
/*
 * OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties_H_
#define TINY_CPP_CLIENT_OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties();
    OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOsgihttpwhiteboardservletpattern();

	/*! \brief Set 
	 */
	void setOsgihttpwhiteboardservletpattern(ConfigNodePropertyString osgihttpwhiteboardservletpattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOsgihttpwhiteboardcontextselect();

	/*! \brief Set 
	 */
	void setOsgihttpwhiteboardcontextselect(ConfigNodePropertyString osgihttpwhiteboardcontextselect);


    private:
    ConfigNodePropertyString osgihttpwhiteboardservletpattern;
    ConfigNodePropertyString osgihttpwhiteboardcontextselect;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties_H_ */
