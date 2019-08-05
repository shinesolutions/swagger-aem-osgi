using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties
    /// </summary>
    public sealed class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties:  IEquatable<ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties>
    { 
        /// <summary>
        /// ArchivingEnabled
        /// </summary>
        public ConfigNodePropertyBoolean ArchivingEnabled { get; private set; }

        /// <summary>
        /// SchedulerExpression
        /// </summary>
        public ConfigNodePropertyString SchedulerExpression { get; private set; }

        /// <summary>
        /// ArchiveSinceDaysCompleted
        /// </summary>
        public ConfigNodePropertyInteger ArchiveSinceDaysCompleted { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties()
        {
        }

        private ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties(ConfigNodePropertyBoolean ArchivingEnabled, ConfigNodePropertyString SchedulerExpression, ConfigNodePropertyInteger ArchiveSinceDaysCompleted)
        {
            
            this.ArchivingEnabled = ArchivingEnabled;
            
            this.SchedulerExpression = SchedulerExpression;
            
            this.ArchiveSinceDaysCompleted = ArchiveSinceDaysCompleted;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesBuilder</returns>
        public static ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesBuilder Builder()
        {
            return new ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesBuilder</returns>
        public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesBuilder With()
        {
            return Builder()
                .ArchivingEnabled(ArchivingEnabled)
                .SchedulerExpression(SchedulerExpression)
                .ArchiveSinceDaysCompleted(ArchiveSinceDaysCompleted);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties left, ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties left, ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.
        /// </summary>
        public sealed class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesBuilder
        {
            private ConfigNodePropertyBoolean _ArchivingEnabled;
            private ConfigNodePropertyString _SchedulerExpression;
            private ConfigNodePropertyInteger _ArchiveSinceDaysCompleted;

            internal ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.ArchivingEnabled property.
            /// </summary>
            /// <param name="value">ArchivingEnabled</param>
            public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesBuilder ArchivingEnabled(ConfigNodePropertyBoolean value)
            {
                _ArchivingEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.SchedulerExpression property.
            /// </summary>
            /// <param name="value">SchedulerExpression</param>
            public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesBuilder SchedulerExpression(ConfigNodePropertyString value)
            {
                _SchedulerExpression = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.ArchiveSinceDaysCompleted property.
            /// </summary>
            /// <param name="value">ArchiveSinceDaysCompleted</param>
            public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesBuilder ArchiveSinceDaysCompleted(ConfigNodePropertyInteger value)
            {
                _ArchiveSinceDaysCompleted = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties</returns>
            public ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties Build()
            {
                Validate();
                return new ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties(
                    ArchivingEnabled: _ArchivingEnabled,
                    SchedulerExpression: _SchedulerExpression,
                    ArchiveSinceDaysCompleted: _ArchiveSinceDaysCompleted
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}