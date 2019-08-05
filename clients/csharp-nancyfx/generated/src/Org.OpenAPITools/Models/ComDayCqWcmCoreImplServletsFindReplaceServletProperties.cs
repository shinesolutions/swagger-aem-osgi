using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplServletsFindReplaceServletProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplServletsFindReplaceServletProperties:  IEquatable<ComDayCqWcmCoreImplServletsFindReplaceServletProperties>
    { 
        /// <summary>
        /// Scope
        /// </summary>
        public ConfigNodePropertyArray Scope { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplServletsFindReplaceServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplServletsFindReplaceServletProperties()
        {
        }

        private ComDayCqWcmCoreImplServletsFindReplaceServletProperties(ConfigNodePropertyArray Scope)
        {
            
            this.Scope = Scope;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplServletsFindReplaceServletProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsFindReplaceServletPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplServletsFindReplaceServletPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplServletsFindReplaceServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplServletsFindReplaceServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsFindReplaceServletPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplServletsFindReplaceServletPropertiesBuilder With()
        {
            return Builder()
                .Scope(Scope);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplServletsFindReplaceServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplServletsFindReplaceServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsFindReplaceServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsFindReplaceServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplServletsFindReplaceServletProperties left, ComDayCqWcmCoreImplServletsFindReplaceServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplServletsFindReplaceServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsFindReplaceServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsFindReplaceServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplServletsFindReplaceServletProperties left, ComDayCqWcmCoreImplServletsFindReplaceServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplServletsFindReplaceServletProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplServletsFindReplaceServletPropertiesBuilder
        {
            private ConfigNodePropertyArray _Scope;

            internal ComDayCqWcmCoreImplServletsFindReplaceServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsFindReplaceServletProperties.Scope property.
            /// </summary>
            /// <param name="value">Scope</param>
            public ComDayCqWcmCoreImplServletsFindReplaceServletPropertiesBuilder Scope(ConfigNodePropertyArray value)
            {
                _Scope = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplServletsFindReplaceServletProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplServletsFindReplaceServletProperties</returns>
            public ComDayCqWcmCoreImplServletsFindReplaceServletProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplServletsFindReplaceServletProperties(
                    Scope: _Scope
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}