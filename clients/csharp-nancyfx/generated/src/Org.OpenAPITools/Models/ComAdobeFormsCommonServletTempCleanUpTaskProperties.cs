using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeFormsCommonServletTempCleanUpTaskProperties
    /// </summary>
    public sealed class ComAdobeFormsCommonServletTempCleanUpTaskProperties:  IEquatable<ComAdobeFormsCommonServletTempCleanUpTaskProperties>
    { 
        /// <summary>
        /// SchedulerExpression
        /// </summary>
        public ConfigNodePropertyString SchedulerExpression { get; private set; }

        /// <summary>
        /// DurationForTemporaryStorage
        /// </summary>
        public ConfigNodePropertyString DurationForTemporaryStorage { get; private set; }

        /// <summary>
        /// DurationForAnonymousStorage
        /// </summary>
        public ConfigNodePropertyString DurationForAnonymousStorage { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeFormsCommonServletTempCleanUpTaskProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeFormsCommonServletTempCleanUpTaskProperties()
        {
        }

        private ComAdobeFormsCommonServletTempCleanUpTaskProperties(ConfigNodePropertyString SchedulerExpression, ConfigNodePropertyString DurationForTemporaryStorage, ConfigNodePropertyString DurationForAnonymousStorage)
        {
            
            this.SchedulerExpression = SchedulerExpression;
            
            this.DurationForTemporaryStorage = DurationForTemporaryStorage;
            
            this.DurationForAnonymousStorage = DurationForAnonymousStorage;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeFormsCommonServletTempCleanUpTaskProperties.
        /// </summary>
        /// <returns>ComAdobeFormsCommonServletTempCleanUpTaskPropertiesBuilder</returns>
        public static ComAdobeFormsCommonServletTempCleanUpTaskPropertiesBuilder Builder()
        {
            return new ComAdobeFormsCommonServletTempCleanUpTaskPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeFormsCommonServletTempCleanUpTaskPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeFormsCommonServletTempCleanUpTaskPropertiesBuilder</returns>
        public ComAdobeFormsCommonServletTempCleanUpTaskPropertiesBuilder With()
        {
            return Builder()
                .SchedulerExpression(SchedulerExpression)
                .DurationForTemporaryStorage(DurationForTemporaryStorage)
                .DurationForAnonymousStorage(DurationForAnonymousStorage);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeFormsCommonServletTempCleanUpTaskProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeFormsCommonServletTempCleanUpTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFormsCommonServletTempCleanUpTaskProperties</param>
        /// <param name="right">Compared (ComAdobeFormsCommonServletTempCleanUpTaskProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeFormsCommonServletTempCleanUpTaskProperties left, ComAdobeFormsCommonServletTempCleanUpTaskProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeFormsCommonServletTempCleanUpTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFormsCommonServletTempCleanUpTaskProperties</param>
        /// <param name="right">Compared (ComAdobeFormsCommonServletTempCleanUpTaskProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeFormsCommonServletTempCleanUpTaskProperties left, ComAdobeFormsCommonServletTempCleanUpTaskProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeFormsCommonServletTempCleanUpTaskProperties.
        /// </summary>
        public sealed class ComAdobeFormsCommonServletTempCleanUpTaskPropertiesBuilder
        {
            private ConfigNodePropertyString _SchedulerExpression;
            private ConfigNodePropertyString _DurationForTemporaryStorage;
            private ConfigNodePropertyString _DurationForAnonymousStorage;

            internal ComAdobeFormsCommonServletTempCleanUpTaskPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeFormsCommonServletTempCleanUpTaskProperties.SchedulerExpression property.
            /// </summary>
            /// <param name="value">SchedulerExpression</param>
            public ComAdobeFormsCommonServletTempCleanUpTaskPropertiesBuilder SchedulerExpression(ConfigNodePropertyString value)
            {
                _SchedulerExpression = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFormsCommonServletTempCleanUpTaskProperties.DurationForTemporaryStorage property.
            /// </summary>
            /// <param name="value">DurationForTemporaryStorage</param>
            public ComAdobeFormsCommonServletTempCleanUpTaskPropertiesBuilder DurationForTemporaryStorage(ConfigNodePropertyString value)
            {
                _DurationForTemporaryStorage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFormsCommonServletTempCleanUpTaskProperties.DurationForAnonymousStorage property.
            /// </summary>
            /// <param name="value">DurationForAnonymousStorage</param>
            public ComAdobeFormsCommonServletTempCleanUpTaskPropertiesBuilder DurationForAnonymousStorage(ConfigNodePropertyString value)
            {
                _DurationForAnonymousStorage = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeFormsCommonServletTempCleanUpTaskProperties.
            /// </summary>
            /// <returns>ComAdobeFormsCommonServletTempCleanUpTaskProperties</returns>
            public ComAdobeFormsCommonServletTempCleanUpTaskProperties Build()
            {
                Validate();
                return new ComAdobeFormsCommonServletTempCleanUpTaskProperties(
                    SchedulerExpression: _SchedulerExpression,
                    DurationForTemporaryStorage: _DurationForTemporaryStorage,
                    DurationForAnonymousStorage: _DurationForAnonymousStorage
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}