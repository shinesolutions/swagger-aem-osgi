/*
 * ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties_H_
#define _ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties();
	ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamwebdavversionlinkingenable();

	/*! \brief Set 
	 */
	void setCqdamwebdavversionlinkingenable(ConfigNodePropertyBoolean  cqdamwebdavversionlinkingenable);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamwebdavversionlinkingschedulerperiod();

	/*! \brief Set 
	 */
	void setCqdamwebdavversionlinkingschedulerperiod(ConfigNodePropertyInteger  cqdamwebdavversionlinkingschedulerperiod);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdamwebdavversionlinkingstagingtimeout();

	/*! \brief Set 
	 */
	void setCqdamwebdavversionlinkingstagingtimeout(ConfigNodePropertyInteger  cqdamwebdavversionlinkingstagingtimeout);

private:
	ConfigNodePropertyBoolean cqdamwebdavversionlinkingenable;
	ConfigNodePropertyInteger cqdamwebdavversionlinkingschedulerperiod;
	ConfigNodePropertyInteger cqdamwebdavversionlinkingstagingtimeout;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties_H_ */
