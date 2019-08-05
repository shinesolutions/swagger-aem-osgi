using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties
    /// </summary>
    public sealed class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties:  IEquatable<OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties>
    { 
        /// <summary>
        /// ParserFeatures
        /// </summary>
        public ConfigNodePropertyArray ParserFeatures { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties()
        {
        }

        private OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties(ConfigNodePropertyArray ParserFeatures)
        {
            
            this.ParserFeatures = ParserFeatures;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserPropertiesBuilder</returns>
        public static OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserPropertiesBuilder Builder()
        {
            return new OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserPropertiesBuilder</returns>
        public OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserPropertiesBuilder With()
        {
            return Builder()
                .ParserFeatures(ParserFeatures);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties left, OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties left, OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties.
        /// </summary>
        public sealed class OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserPropertiesBuilder
        {
            private ConfigNodePropertyArray _ParserFeatures;

            internal OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties.ParserFeatures property.
            /// </summary>
            /// <param name="value">ParserFeatures</param>
            public OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserPropertiesBuilder ParserFeatures(ConfigNodePropertyArray value)
            {
                _ParserFeatures = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties.
            /// </summary>
            /// <returns>OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties</returns>
            public OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties Build()
            {
                Validate();
                return new OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties(
                    ParserFeatures: _ParserFeatures
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}