using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties
    /// </summary>
    public sealed class ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties:  IEquatable<ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties>
    { 
        /// <summary>
        /// JobTopics
        /// </summary>
        public ConfigNodePropertyString JobTopics { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties()
        {
        }

        private ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties(ConfigNodePropertyString JobTopics)
        {
            
            this.JobTopics = JobTopics;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskPropertiesBuilder</returns>
        public static ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskPropertiesBuilder</returns>
        public ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskPropertiesBuilder With()
        {
            return Builder()
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

        public bool Equals(ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties left, ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties left, ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties.
        /// </summary>
        public sealed class ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskPropertiesBuilder
        {
            private ConfigNodePropertyString _JobTopics;

            internal ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties.JobTopics property.
            /// </summary>
            /// <param name="value">JobTopics</param>
            public ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskPropertiesBuilder JobTopics(ConfigNodePropertyString value)
            {
                _JobTopics = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties</returns>
            public ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties Build()
            {
                Validate();
                return new ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties(
                    JobTopics: _JobTopics
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}