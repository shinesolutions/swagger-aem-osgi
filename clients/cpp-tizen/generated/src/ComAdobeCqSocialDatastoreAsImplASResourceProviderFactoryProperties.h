/*
 * ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties_H_
#define _ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"
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

class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties();
	ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getVersionid();

	/*! \brief Set 
	 */
	void setVersionid(ConfigNodePropertyString  versionid);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCacheon();

	/*! \brief Set 
	 */
	void setCacheon(ConfigNodePropertyBoolean  cacheon);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConcurrencylevel();

	/*! \brief Set 
	 */
	void setConcurrencylevel(ConfigNodePropertyInteger  concurrencylevel);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCachestartsize();

	/*! \brief Set 
	 */
	void setCachestartsize(ConfigNodePropertyInteger  cachestartsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCachettl();

	/*! \brief Set 
	 */
	void setCachettl(ConfigNodePropertyInteger  cachettl);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCachesize();

	/*! \brief Set 
	 */
	void setCachesize(ConfigNodePropertyInteger  cachesize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTimelimit();

	/*! \brief Set 
	 */
	void setTimelimit(ConfigNodePropertyInteger  timelimit);

private:
	ConfigNodePropertyString versionid;
	ConfigNodePropertyBoolean cacheon;
	ConfigNodePropertyInteger concurrencylevel;
	ConfigNodePropertyInteger cachestartsize;
	ConfigNodePropertyInteger cachettl;
	ConfigNodePropertyInteger cachesize;
	ConfigNodePropertyInteger timelimit;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties_H_ */
