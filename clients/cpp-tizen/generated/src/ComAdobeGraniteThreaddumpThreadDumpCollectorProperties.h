/*
 * ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteThreaddumpThreadDumpCollectorProperties_H_
#define _ComAdobeGraniteThreaddumpThreadDumpCollectorProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
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

class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteThreaddumpThreadDumpCollectorProperties();
	ComAdobeGraniteThreaddumpThreadDumpCollectorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteThreaddumpThreadDumpCollectorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSchedulerperiod();

	/*! \brief Set 
	 */
	void setSchedulerperiod(ConfigNodePropertyInteger  schedulerperiod);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getSchedulerrunOn();

	/*! \brief Set 
	 */
	void setSchedulerrunOn(ConfigNodePropertyDropDown  schedulerrunOn);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGranitethreaddumpenabled();

	/*! \brief Set 
	 */
	void setGranitethreaddumpenabled(ConfigNodePropertyBoolean  granitethreaddumpenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getGranitethreaddumpdumpsPerFile();

	/*! \brief Set 
	 */
	void setGranitethreaddumpdumpsPerFile(ConfigNodePropertyInteger  granitethreaddumpdumpsPerFile);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGranitethreaddumpenableGzipCompression();

	/*! \brief Set 
	 */
	void setGranitethreaddumpenableGzipCompression(ConfigNodePropertyBoolean  granitethreaddumpenableGzipCompression);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGranitethreaddumpenableDirectoriesCompression();

	/*! \brief Set 
	 */
	void setGranitethreaddumpenableDirectoriesCompression(ConfigNodePropertyBoolean  granitethreaddumpenableDirectoriesCompression);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getGranitethreaddumpenableJStack();

	/*! \brief Set 
	 */
	void setGranitethreaddumpenableJStack(ConfigNodePropertyBoolean  granitethreaddumpenableJStack);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getGranitethreaddumpmaxBackupDays();

	/*! \brief Set 
	 */
	void setGranitethreaddumpmaxBackupDays(ConfigNodePropertyInteger  granitethreaddumpmaxBackupDays);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getGranitethreaddumpbackupCleanTrigger();

	/*! \brief Set 
	 */
	void setGranitethreaddumpbackupCleanTrigger(ConfigNodePropertyString  granitethreaddumpbackupCleanTrigger);

private:
	ConfigNodePropertyInteger schedulerperiod;
	ConfigNodePropertyDropDown schedulerrunOn;
	ConfigNodePropertyBoolean granitethreaddumpenabled;
	ConfigNodePropertyInteger granitethreaddumpdumpsPerFile;
	ConfigNodePropertyBoolean granitethreaddumpenableGzipCompression;
	ConfigNodePropertyBoolean granitethreaddumpenableDirectoriesCompression;
	ConfigNodePropertyBoolean granitethreaddumpenableJStack;
	ConfigNodePropertyInteger granitethreaddumpmaxBackupDays;
	ConfigNodePropertyString granitethreaddumpbackupCleanTrigger;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteThreaddumpThreadDumpCollectorProperties_H_ */
