using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties
    /// </summary>
    public sealed class ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties:  IEquatable<ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties>
    { 
        /// <summary>
        /// NameWhitelist
        /// </summary>
        public ConfigNodePropertyString NameWhitelist { get; private set; }

        /// <summary>
        /// AllowExpressions
        /// </summary>
        public ConfigNodePropertyBoolean AllowExpressions { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties()
        {
        }

        private ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties(ConfigNodePropertyString NameWhitelist, ConfigNodePropertyBoolean AllowExpressions)
        {
            
            this.NameWhitelist = NameWhitelist;
            
            this.AllowExpressions = AllowExpressions;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesBuilder</returns>
        public static ComDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesBuilder Builder()
        {
            return new ComDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesBuilder</returns>
        public ComDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesBuilder With()
        {
            return Builder()
                .NameWhitelist(NameWhitelist)
                .AllowExpressions(AllowExpressions);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties left, ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties left, ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties.
        /// </summary>
        public sealed class ComDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesBuilder
        {
            private ConfigNodePropertyString _NameWhitelist;
            private ConfigNodePropertyBoolean _AllowExpressions;

            internal ComDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties.NameWhitelist property.
            /// </summary>
            /// <param name="value">NameWhitelist</param>
            public ComDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesBuilder NameWhitelist(ConfigNodePropertyString value)
            {
                _NameWhitelist = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties.AllowExpressions property.
            /// </summary>
            /// <param name="value">AllowExpressions</param>
            public ComDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesBuilder AllowExpressions(ConfigNodePropertyBoolean value)
            {
                _AllowExpressions = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties</returns>
            public ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties Build()
            {
                Validate();
                return new ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties(
                    NameWhitelist: _NameWhitelist,
                    AllowExpressions: _AllowExpressions
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}