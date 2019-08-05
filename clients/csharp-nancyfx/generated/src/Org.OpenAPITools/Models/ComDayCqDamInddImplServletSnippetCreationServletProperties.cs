using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamInddImplServletSnippetCreationServletProperties
    /// </summary>
    public sealed class ComDayCqDamInddImplServletSnippetCreationServletProperties:  IEquatable<ComDayCqDamInddImplServletSnippetCreationServletProperties>
    { 
        /// <summary>
        /// SnippetcreationMaxcollections
        /// </summary>
        public ConfigNodePropertyInteger SnippetcreationMaxcollections { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamInddImplServletSnippetCreationServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamInddImplServletSnippetCreationServletProperties()
        {
        }

        private ComDayCqDamInddImplServletSnippetCreationServletProperties(ConfigNodePropertyInteger SnippetcreationMaxcollections)
        {
            
            this.SnippetcreationMaxcollections = SnippetcreationMaxcollections;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamInddImplServletSnippetCreationServletProperties.
        /// </summary>
        /// <returns>ComDayCqDamInddImplServletSnippetCreationServletPropertiesBuilder</returns>
        public static ComDayCqDamInddImplServletSnippetCreationServletPropertiesBuilder Builder()
        {
            return new ComDayCqDamInddImplServletSnippetCreationServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamInddImplServletSnippetCreationServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamInddImplServletSnippetCreationServletPropertiesBuilder</returns>
        public ComDayCqDamInddImplServletSnippetCreationServletPropertiesBuilder With()
        {
            return Builder()
                .SnippetcreationMaxcollections(SnippetcreationMaxcollections);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamInddImplServletSnippetCreationServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamInddImplServletSnippetCreationServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamInddImplServletSnippetCreationServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamInddImplServletSnippetCreationServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamInddImplServletSnippetCreationServletProperties left, ComDayCqDamInddImplServletSnippetCreationServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamInddImplServletSnippetCreationServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamInddImplServletSnippetCreationServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamInddImplServletSnippetCreationServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamInddImplServletSnippetCreationServletProperties left, ComDayCqDamInddImplServletSnippetCreationServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamInddImplServletSnippetCreationServletProperties.
        /// </summary>
        public sealed class ComDayCqDamInddImplServletSnippetCreationServletPropertiesBuilder
        {
            private ConfigNodePropertyInteger _SnippetcreationMaxcollections;

            internal ComDayCqDamInddImplServletSnippetCreationServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamInddImplServletSnippetCreationServletProperties.SnippetcreationMaxcollections property.
            /// </summary>
            /// <param name="value">SnippetcreationMaxcollections</param>
            public ComDayCqDamInddImplServletSnippetCreationServletPropertiesBuilder SnippetcreationMaxcollections(ConfigNodePropertyInteger value)
            {
                _SnippetcreationMaxcollections = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamInddImplServletSnippetCreationServletProperties.
            /// </summary>
            /// <returns>ComDayCqDamInddImplServletSnippetCreationServletProperties</returns>
            public ComDayCqDamInddImplServletSnippetCreationServletProperties Build()
            {
                Validate();
                return new ComDayCqDamInddImplServletSnippetCreationServletProperties(
                    SnippetcreationMaxcollections: _SnippetcreationMaxcollections
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}