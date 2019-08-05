using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties:  IEquatable<OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties>
    { 
        /// <summary>
        /// CommitsTrackerWriterGroups
        /// </summary>
        public ConfigNodePropertyArray CommitsTrackerWriterGroups { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties()
        {
        }

        private OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties(ConfigNodePropertyArray CommitsTrackerWriterGroups)
        {
            
            this.CommitsTrackerWriterGroups = CommitsTrackerWriterGroups;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServicePropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServicePropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServicePropertiesBuilder</returns>
        public OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServicePropertiesBuilder With()
        {
            return Builder()
                .CommitsTrackerWriterGroups(CommitsTrackerWriterGroups);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties left, OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties left, OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServicePropertiesBuilder
        {
            private ConfigNodePropertyArray _CommitsTrackerWriterGroups;

            internal OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties.CommitsTrackerWriterGroups property.
            /// </summary>
            /// <param name="value">CommitsTrackerWriterGroups</param>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServicePropertiesBuilder CommitsTrackerWriterGroups(ConfigNodePropertyArray value)
            {
                _CommitsTrackerWriterGroups = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties</returns>
            public OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties(
                    CommitsTrackerWriterGroups: _CommitsTrackerWriterGroups
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}