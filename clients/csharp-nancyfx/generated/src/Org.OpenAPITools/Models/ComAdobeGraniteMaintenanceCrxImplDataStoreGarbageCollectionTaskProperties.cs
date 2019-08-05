using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties
    /// </summary>
    public sealed class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties:  IEquatable<ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties>
    { 
        /// <summary>
        /// GraniteMaintenanceMandatory
        /// </summary>
        public ConfigNodePropertyBoolean GraniteMaintenanceMandatory { get; private set; }

        /// <summary>
        /// JobTopics
        /// </summary>
        public ConfigNodePropertyString JobTopics { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties()
        {
        }

        private ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties(ConfigNodePropertyBoolean GraniteMaintenanceMandatory, ConfigNodePropertyString JobTopics)
        {
            
            this.GraniteMaintenanceMandatory = GraniteMaintenanceMandatory;
            
            this.JobTopics = JobTopics;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesBuilder</returns>
        public static ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesBuilder</returns>
        public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesBuilder With()
        {
            return Builder()
                .GraniteMaintenanceMandatory(GraniteMaintenanceMandatory)
                .JobTopics(JobTopics);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties left, ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties left, ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.
        /// </summary>
        public sealed class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _GraniteMaintenanceMandatory;
            private ConfigNodePropertyString _JobTopics;

            internal ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.GraniteMaintenanceMandatory property.
            /// </summary>
            /// <param name="value">GraniteMaintenanceMandatory</param>
            public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesBuilder GraniteMaintenanceMandatory(ConfigNodePropertyBoolean value)
            {
                _GraniteMaintenanceMandatory = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.JobTopics property.
            /// </summary>
            /// <param name="value">JobTopics</param>
            public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesBuilder JobTopics(ConfigNodePropertyString value)
            {
                _JobTopics = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties</returns>
            public ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties Build()
            {
                Validate();
                return new ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties(
                    GraniteMaintenanceMandatory: _GraniteMaintenanceMandatory,
                    JobTopics: _JobTopics
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}