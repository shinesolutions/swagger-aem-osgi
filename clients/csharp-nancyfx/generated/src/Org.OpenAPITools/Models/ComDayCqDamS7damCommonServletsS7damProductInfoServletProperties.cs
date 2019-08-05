using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties
    /// </summary>
    public sealed class ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties:  IEquatable<ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties>
    { 
        /// <summary>
        /// SlingServletPaths
        /// </summary>
        public ConfigNodePropertyString SlingServletPaths { get; private set; }

        /// <summary>
        /// SlingServletMethods
        /// </summary>
        public ConfigNodePropertyString SlingServletMethods { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties()
        {
        }

        private ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties(ConfigNodePropertyString SlingServletPaths, ConfigNodePropertyString SlingServletMethods)
        {
            
            this.SlingServletPaths = SlingServletPaths;
            
            this.SlingServletMethods = SlingServletMethods;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesBuilder</returns>
        public static ComDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesBuilder Builder()
        {
            return new ComDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesBuilder</returns>
        public ComDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesBuilder With()
        {
            return Builder()
                .SlingServletPaths(SlingServletPaths)
                .SlingServletMethods(SlingServletMethods);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties left, ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties left, ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties.
        /// </summary>
        public sealed class ComDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesBuilder
        {
            private ConfigNodePropertyString _SlingServletPaths;
            private ConfigNodePropertyString _SlingServletMethods;

            internal ComDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties.SlingServletPaths property.
            /// </summary>
            /// <param name="value">SlingServletPaths</param>
            public ComDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesBuilder SlingServletPaths(ConfigNodePropertyString value)
            {
                _SlingServletPaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties.SlingServletMethods property.
            /// </summary>
            /// <param name="value">SlingServletMethods</param>
            public ComDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesBuilder SlingServletMethods(ConfigNodePropertyString value)
            {
                _SlingServletMethods = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties.
            /// </summary>
            /// <returns>ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties</returns>
            public ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties Build()
            {
                Validate();
                return new ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties(
                    SlingServletPaths: _SlingServletPaths,
                    SlingServletMethods: _SlingServletMethods
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}