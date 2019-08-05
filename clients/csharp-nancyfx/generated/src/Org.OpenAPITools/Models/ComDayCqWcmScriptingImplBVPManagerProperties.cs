using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmScriptingImplBVPManagerProperties
    /// </summary>
    public sealed class ComDayCqWcmScriptingImplBVPManagerProperties:  IEquatable<ComDayCqWcmScriptingImplBVPManagerProperties>
    { 
        /// <summary>
        /// ComDayCqWcmScriptingBvpScriptEngines
        /// </summary>
        public ConfigNodePropertyArray ComDayCqWcmScriptingBvpScriptEngines { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmScriptingImplBVPManagerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmScriptingImplBVPManagerProperties()
        {
        }

        private ComDayCqWcmScriptingImplBVPManagerProperties(ConfigNodePropertyArray ComDayCqWcmScriptingBvpScriptEngines)
        {
            
            this.ComDayCqWcmScriptingBvpScriptEngines = ComDayCqWcmScriptingBvpScriptEngines;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmScriptingImplBVPManagerProperties.
        /// </summary>
        /// <returns>ComDayCqWcmScriptingImplBVPManagerPropertiesBuilder</returns>
        public static ComDayCqWcmScriptingImplBVPManagerPropertiesBuilder Builder()
        {
            return new ComDayCqWcmScriptingImplBVPManagerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmScriptingImplBVPManagerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmScriptingImplBVPManagerPropertiesBuilder</returns>
        public ComDayCqWcmScriptingImplBVPManagerPropertiesBuilder With()
        {
            return Builder()
                .ComDayCqWcmScriptingBvpScriptEngines(ComDayCqWcmScriptingBvpScriptEngines);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmScriptingImplBVPManagerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmScriptingImplBVPManagerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmScriptingImplBVPManagerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmScriptingImplBVPManagerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmScriptingImplBVPManagerProperties left, ComDayCqWcmScriptingImplBVPManagerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmScriptingImplBVPManagerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmScriptingImplBVPManagerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmScriptingImplBVPManagerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmScriptingImplBVPManagerProperties left, ComDayCqWcmScriptingImplBVPManagerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmScriptingImplBVPManagerProperties.
        /// </summary>
        public sealed class ComDayCqWcmScriptingImplBVPManagerPropertiesBuilder
        {
            private ConfigNodePropertyArray _ComDayCqWcmScriptingBvpScriptEngines;

            internal ComDayCqWcmScriptingImplBVPManagerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmScriptingImplBVPManagerProperties.ComDayCqWcmScriptingBvpScriptEngines property.
            /// </summary>
            /// <param name="value">ComDayCqWcmScriptingBvpScriptEngines</param>
            public ComDayCqWcmScriptingImplBVPManagerPropertiesBuilder ComDayCqWcmScriptingBvpScriptEngines(ConfigNodePropertyArray value)
            {
                _ComDayCqWcmScriptingBvpScriptEngines = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmScriptingImplBVPManagerProperties.
            /// </summary>
            /// <returns>ComDayCqWcmScriptingImplBVPManagerProperties</returns>
            public ComDayCqWcmScriptingImplBVPManagerProperties Build()
            {
                Validate();
                return new ComDayCqWcmScriptingImplBVPManagerProperties(
                    ComDayCqWcmScriptingBvpScriptEngines: _ComDayCqWcmScriptingBvpScriptEngines
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}