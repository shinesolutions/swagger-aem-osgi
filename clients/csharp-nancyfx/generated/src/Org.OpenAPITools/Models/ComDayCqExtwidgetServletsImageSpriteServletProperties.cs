using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqExtwidgetServletsImageSpriteServletProperties
    /// </summary>
    public sealed class ComDayCqExtwidgetServletsImageSpriteServletProperties:  IEquatable<ComDayCqExtwidgetServletsImageSpriteServletProperties>
    { 
        /// <summary>
        /// MaxWidth
        /// </summary>
        public ConfigNodePropertyInteger MaxWidth { get; private set; }

        /// <summary>
        /// MaxHeight
        /// </summary>
        public ConfigNodePropertyInteger MaxHeight { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqExtwidgetServletsImageSpriteServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqExtwidgetServletsImageSpriteServletProperties()
        {
        }

        private ComDayCqExtwidgetServletsImageSpriteServletProperties(ConfigNodePropertyInteger MaxWidth, ConfigNodePropertyInteger MaxHeight)
        {
            
            this.MaxWidth = MaxWidth;
            
            this.MaxHeight = MaxHeight;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqExtwidgetServletsImageSpriteServletProperties.
        /// </summary>
        /// <returns>ComDayCqExtwidgetServletsImageSpriteServletPropertiesBuilder</returns>
        public static ComDayCqExtwidgetServletsImageSpriteServletPropertiesBuilder Builder()
        {
            return new ComDayCqExtwidgetServletsImageSpriteServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqExtwidgetServletsImageSpriteServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqExtwidgetServletsImageSpriteServletPropertiesBuilder</returns>
        public ComDayCqExtwidgetServletsImageSpriteServletPropertiesBuilder With()
        {
            return Builder()
                .MaxWidth(MaxWidth)
                .MaxHeight(MaxHeight);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqExtwidgetServletsImageSpriteServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqExtwidgetServletsImageSpriteServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqExtwidgetServletsImageSpriteServletProperties</param>
        /// <param name="right">Compared (ComDayCqExtwidgetServletsImageSpriteServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqExtwidgetServletsImageSpriteServletProperties left, ComDayCqExtwidgetServletsImageSpriteServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqExtwidgetServletsImageSpriteServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqExtwidgetServletsImageSpriteServletProperties</param>
        /// <param name="right">Compared (ComDayCqExtwidgetServletsImageSpriteServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqExtwidgetServletsImageSpriteServletProperties left, ComDayCqExtwidgetServletsImageSpriteServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqExtwidgetServletsImageSpriteServletProperties.
        /// </summary>
        public sealed class ComDayCqExtwidgetServletsImageSpriteServletPropertiesBuilder
        {
            private ConfigNodePropertyInteger _MaxWidth;
            private ConfigNodePropertyInteger _MaxHeight;

            internal ComDayCqExtwidgetServletsImageSpriteServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqExtwidgetServletsImageSpriteServletProperties.MaxWidth property.
            /// </summary>
            /// <param name="value">MaxWidth</param>
            public ComDayCqExtwidgetServletsImageSpriteServletPropertiesBuilder MaxWidth(ConfigNodePropertyInteger value)
            {
                _MaxWidth = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqExtwidgetServletsImageSpriteServletProperties.MaxHeight property.
            /// </summary>
            /// <param name="value">MaxHeight</param>
            public ComDayCqExtwidgetServletsImageSpriteServletPropertiesBuilder MaxHeight(ConfigNodePropertyInteger value)
            {
                _MaxHeight = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqExtwidgetServletsImageSpriteServletProperties.
            /// </summary>
            /// <returns>ComDayCqExtwidgetServletsImageSpriteServletProperties</returns>
            public ComDayCqExtwidgetServletsImageSpriteServletProperties Build()
            {
                Validate();
                return new ComDayCqExtwidgetServletsImageSpriteServletProperties(
                    MaxWidth: _MaxWidth,
                    MaxHeight: _MaxHeight
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}