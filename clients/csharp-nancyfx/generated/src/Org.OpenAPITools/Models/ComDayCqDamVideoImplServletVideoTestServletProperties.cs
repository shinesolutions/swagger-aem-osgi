using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamVideoImplServletVideoTestServletProperties
    /// </summary>
    public sealed class ComDayCqDamVideoImplServletVideoTestServletProperties:  IEquatable<ComDayCqDamVideoImplServletVideoTestServletProperties>
    { 
        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamVideoImplServletVideoTestServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamVideoImplServletVideoTestServletProperties()
        {
        }

        private ComDayCqDamVideoImplServletVideoTestServletProperties(ConfigNodePropertyBoolean Enabled)
        {
            
            this.Enabled = Enabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamVideoImplServletVideoTestServletProperties.
        /// </summary>
        /// <returns>ComDayCqDamVideoImplServletVideoTestServletPropertiesBuilder</returns>
        public static ComDayCqDamVideoImplServletVideoTestServletPropertiesBuilder Builder()
        {
            return new ComDayCqDamVideoImplServletVideoTestServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamVideoImplServletVideoTestServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamVideoImplServletVideoTestServletPropertiesBuilder</returns>
        public ComDayCqDamVideoImplServletVideoTestServletPropertiesBuilder With()
        {
            return Builder()
                .Enabled(Enabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamVideoImplServletVideoTestServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamVideoImplServletVideoTestServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamVideoImplServletVideoTestServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamVideoImplServletVideoTestServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamVideoImplServletVideoTestServletProperties left, ComDayCqDamVideoImplServletVideoTestServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamVideoImplServletVideoTestServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamVideoImplServletVideoTestServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamVideoImplServletVideoTestServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamVideoImplServletVideoTestServletProperties left, ComDayCqDamVideoImplServletVideoTestServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamVideoImplServletVideoTestServletProperties.
        /// </summary>
        public sealed class ComDayCqDamVideoImplServletVideoTestServletPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Enabled;

            internal ComDayCqDamVideoImplServletVideoTestServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamVideoImplServletVideoTestServletProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public ComDayCqDamVideoImplServletVideoTestServletPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamVideoImplServletVideoTestServletProperties.
            /// </summary>
            /// <returns>ComDayCqDamVideoImplServletVideoTestServletProperties</returns>
            public ComDayCqDamVideoImplServletVideoTestServletProperties Build()
            {
                Validate();
                return new ComDayCqDamVideoImplServletVideoTestServletProperties(
                    Enabled: _Enabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}