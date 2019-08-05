using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties
    /// </summary>
    public sealed class ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties:  IEquatable<ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties>
    { 
        /// <summary>
        /// FormportalInterval
        /// </summary>
        public ConfigNodePropertyString FormportalInterval { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties()
        {
        }

        private ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties(ConfigNodePropertyString FormportalInterval)
        {
            
            this.FormportalInterval = FormportalInterval;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties.
        /// </summary>
        /// <returns>ComAdobeFdFpConfigFormsPortalSchedulerServicePropertiesBuilder</returns>
        public static ComAdobeFdFpConfigFormsPortalSchedulerServicePropertiesBuilder Builder()
        {
            return new ComAdobeFdFpConfigFormsPortalSchedulerServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeFdFpConfigFormsPortalSchedulerServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeFdFpConfigFormsPortalSchedulerServicePropertiesBuilder</returns>
        public ComAdobeFdFpConfigFormsPortalSchedulerServicePropertiesBuilder With()
        {
            return Builder()
                .FormportalInterval(FormportalInterval);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties</param>
        /// <param name="right">Compared (ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties left, ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties</param>
        /// <param name="right">Compared (ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties left, ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties.
        /// </summary>
        public sealed class ComAdobeFdFpConfigFormsPortalSchedulerServicePropertiesBuilder
        {
            private ConfigNodePropertyString _FormportalInterval;

            internal ComAdobeFdFpConfigFormsPortalSchedulerServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties.FormportalInterval property.
            /// </summary>
            /// <param name="value">FormportalInterval</param>
            public ComAdobeFdFpConfigFormsPortalSchedulerServicePropertiesBuilder FormportalInterval(ConfigNodePropertyString value)
            {
                _FormportalInterval = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties.
            /// </summary>
            /// <returns>ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties</returns>
            public ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties Build()
            {
                Validate();
                return new ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties(
                    FormportalInterval: _FormportalInterval
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}