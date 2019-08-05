using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMsmImplServletsAuditLogServletProperties
    /// </summary>
    public sealed class ComDayCqWcmMsmImplServletsAuditLogServletProperties:  IEquatable<ComDayCqWcmMsmImplServletsAuditLogServletProperties>
    { 
        /// <summary>
        /// AuditlogservletDefaultEventsCount
        /// </summary>
        public ConfigNodePropertyInteger AuditlogservletDefaultEventsCount { get; private set; }

        /// <summary>
        /// AuditlogservletDefaultPath
        /// </summary>
        public ConfigNodePropertyString AuditlogservletDefaultPath { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmMsmImplServletsAuditLogServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMsmImplServletsAuditLogServletProperties()
        {
        }

        private ComDayCqWcmMsmImplServletsAuditLogServletProperties(ConfigNodePropertyInteger AuditlogservletDefaultEventsCount, ConfigNodePropertyString AuditlogservletDefaultPath)
        {
            
            this.AuditlogservletDefaultEventsCount = AuditlogservletDefaultEventsCount;
            
            this.AuditlogservletDefaultPath = AuditlogservletDefaultPath;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMsmImplServletsAuditLogServletProperties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplServletsAuditLogServletPropertiesBuilder</returns>
        public static ComDayCqWcmMsmImplServletsAuditLogServletPropertiesBuilder Builder()
        {
            return new ComDayCqWcmMsmImplServletsAuditLogServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMsmImplServletsAuditLogServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplServletsAuditLogServletPropertiesBuilder</returns>
        public ComDayCqWcmMsmImplServletsAuditLogServletPropertiesBuilder With()
        {
            return Builder()
                .AuditlogservletDefaultEventsCount(AuditlogservletDefaultEventsCount)
                .AuditlogservletDefaultPath(AuditlogservletDefaultPath);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmMsmImplServletsAuditLogServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMsmImplServletsAuditLogServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplServletsAuditLogServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplServletsAuditLogServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMsmImplServletsAuditLogServletProperties left, ComDayCqWcmMsmImplServletsAuditLogServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMsmImplServletsAuditLogServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplServletsAuditLogServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplServletsAuditLogServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMsmImplServletsAuditLogServletProperties left, ComDayCqWcmMsmImplServletsAuditLogServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMsmImplServletsAuditLogServletProperties.
        /// </summary>
        public sealed class ComDayCqWcmMsmImplServletsAuditLogServletPropertiesBuilder
        {
            private ConfigNodePropertyInteger _AuditlogservletDefaultEventsCount;
            private ConfigNodePropertyString _AuditlogservletDefaultPath;

            internal ComDayCqWcmMsmImplServletsAuditLogServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplServletsAuditLogServletProperties.AuditlogservletDefaultEventsCount property.
            /// </summary>
            /// <param name="value">AuditlogservletDefaultEventsCount</param>
            public ComDayCqWcmMsmImplServletsAuditLogServletPropertiesBuilder AuditlogservletDefaultEventsCount(ConfigNodePropertyInteger value)
            {
                _AuditlogservletDefaultEventsCount = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplServletsAuditLogServletProperties.AuditlogservletDefaultPath property.
            /// </summary>
            /// <param name="value">AuditlogservletDefaultPath</param>
            public ComDayCqWcmMsmImplServletsAuditLogServletPropertiesBuilder AuditlogservletDefaultPath(ConfigNodePropertyString value)
            {
                _AuditlogservletDefaultPath = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMsmImplServletsAuditLogServletProperties.
            /// </summary>
            /// <returns>ComDayCqWcmMsmImplServletsAuditLogServletProperties</returns>
            public ComDayCqWcmMsmImplServletsAuditLogServletProperties Build()
            {
                Validate();
                return new ComDayCqWcmMsmImplServletsAuditLogServletProperties(
                    AuditlogservletDefaultEventsCount: _AuditlogservletDefaultEventsCount,
                    AuditlogservletDefaultPath: _AuditlogservletDefaultPath
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}