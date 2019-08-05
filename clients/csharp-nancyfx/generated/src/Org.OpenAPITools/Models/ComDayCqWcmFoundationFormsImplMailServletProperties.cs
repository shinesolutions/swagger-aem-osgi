using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationFormsImplMailServletProperties
    /// </summary>
    public sealed class ComDayCqWcmFoundationFormsImplMailServletProperties:  IEquatable<ComDayCqWcmFoundationFormsImplMailServletProperties>
    { 
        /// <summary>
        /// SlingServletResourceTypes
        /// </summary>
        public ConfigNodePropertyString SlingServletResourceTypes { get; private set; }

        /// <summary>
        /// SlingServletSelectors
        /// </summary>
        public ConfigNodePropertyString SlingServletSelectors { get; private set; }

        /// <summary>
        /// ResourceWhitelist
        /// </summary>
        public ConfigNodePropertyArray ResourceWhitelist { get; private set; }

        /// <summary>
        /// ResourceBlacklist
        /// </summary>
        public ConfigNodePropertyString ResourceBlacklist { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmFoundationFormsImplMailServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationFormsImplMailServletProperties()
        {
        }

        private ComDayCqWcmFoundationFormsImplMailServletProperties(ConfigNodePropertyString SlingServletResourceTypes, ConfigNodePropertyString SlingServletSelectors, ConfigNodePropertyArray ResourceWhitelist, ConfigNodePropertyString ResourceBlacklist)
        {
            
            this.SlingServletResourceTypes = SlingServletResourceTypes;
            
            this.SlingServletSelectors = SlingServletSelectors;
            
            this.ResourceWhitelist = ResourceWhitelist;
            
            this.ResourceBlacklist = ResourceBlacklist;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationFormsImplMailServletProperties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationFormsImplMailServletPropertiesBuilder</returns>
        public static ComDayCqWcmFoundationFormsImplMailServletPropertiesBuilder Builder()
        {
            return new ComDayCqWcmFoundationFormsImplMailServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationFormsImplMailServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationFormsImplMailServletPropertiesBuilder</returns>
        public ComDayCqWcmFoundationFormsImplMailServletPropertiesBuilder With()
        {
            return Builder()
                .SlingServletResourceTypes(SlingServletResourceTypes)
                .SlingServletSelectors(SlingServletSelectors)
                .ResourceWhitelist(ResourceWhitelist)
                .ResourceBlacklist(ResourceBlacklist);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmFoundationFormsImplMailServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationFormsImplMailServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationFormsImplMailServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationFormsImplMailServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationFormsImplMailServletProperties left, ComDayCqWcmFoundationFormsImplMailServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationFormsImplMailServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationFormsImplMailServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationFormsImplMailServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationFormsImplMailServletProperties left, ComDayCqWcmFoundationFormsImplMailServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationFormsImplMailServletProperties.
        /// </summary>
        public sealed class ComDayCqWcmFoundationFormsImplMailServletPropertiesBuilder
        {
            private ConfigNodePropertyString _SlingServletResourceTypes;
            private ConfigNodePropertyString _SlingServletSelectors;
            private ConfigNodePropertyArray _ResourceWhitelist;
            private ConfigNodePropertyString _ResourceBlacklist;

            internal ComDayCqWcmFoundationFormsImplMailServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplMailServletProperties.SlingServletResourceTypes property.
            /// </summary>
            /// <param name="value">SlingServletResourceTypes</param>
            public ComDayCqWcmFoundationFormsImplMailServletPropertiesBuilder SlingServletResourceTypes(ConfigNodePropertyString value)
            {
                _SlingServletResourceTypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplMailServletProperties.SlingServletSelectors property.
            /// </summary>
            /// <param name="value">SlingServletSelectors</param>
            public ComDayCqWcmFoundationFormsImplMailServletPropertiesBuilder SlingServletSelectors(ConfigNodePropertyString value)
            {
                _SlingServletSelectors = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplMailServletProperties.ResourceWhitelist property.
            /// </summary>
            /// <param name="value">ResourceWhitelist</param>
            public ComDayCqWcmFoundationFormsImplMailServletPropertiesBuilder ResourceWhitelist(ConfigNodePropertyArray value)
            {
                _ResourceWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplMailServletProperties.ResourceBlacklist property.
            /// </summary>
            /// <param name="value">ResourceBlacklist</param>
            public ComDayCqWcmFoundationFormsImplMailServletPropertiesBuilder ResourceBlacklist(ConfigNodePropertyString value)
            {
                _ResourceBlacklist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationFormsImplMailServletProperties.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationFormsImplMailServletProperties</returns>
            public ComDayCqWcmFoundationFormsImplMailServletProperties Build()
            {
                Validate();
                return new ComDayCqWcmFoundationFormsImplMailServletProperties(
                    SlingServletResourceTypes: _SlingServletResourceTypes,
                    SlingServletSelectors: _SlingServletSelectors,
                    ResourceWhitelist: _ResourceWhitelist,
                    ResourceBlacklist: _ResourceBlacklist
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}